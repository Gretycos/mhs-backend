package com.mhs.user.service.impl;

import com.mhs.common.enums.user.UserServiceResultEnum;
import com.mhs.common.exception.MHSException;
import com.mhs.common.util.NumberUtil;
import com.mhs.common.util.TokenUtil;
import com.mhs.entity.user.PatientLogin;
import com.mhs.user.mapper.PatientAuthMapper;
import com.mhs.user.mapper.PatientLoginMapper;
import com.mhs.user.mapper.PatientMapper;
import com.mhs.user.mapper.dto.PatientLoginDTO;
import com.mhs.user.redis.RedisCache;
import com.mhs.user.service.IPatientLoginService;
import com.mhs.user.web.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import static com.mhs.common.constant.user.UserConstant.TOKEN_EXPIRED_TIME;
import static com.mhs.common.constant.user.UserConstant.USER_ID_TOKEN_KEY;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Tsong
 * @since 2024-03-25
 */
@Service
public class PatientLoginServiceImpl implements IPatientLoginService {

    @Autowired
    private PatientAuthMapper patientAuthMapper;
    @Autowired
    private PatientMapper patientMapper;
    @Autowired
    private PatientLoginMapper patientLoginMapper;
    @Autowired
    private RedisCache redisCache;

    @Override
    public LoginVO login(String email, String pswMD5) {
        PatientLoginDTO loginDTO = patientMapper.selectIdByEmail(email);
        if (loginDTO == null) {
            return null;
        }
        if (loginDTO.getIsDeleted() != 0){
            MHSException.fail(UserServiceResultEnum.LOGIN_USER_LOCKED_ERROR.getResult());
        }
        String patientId = loginDTO.getPatientId();
        String pswMD5FromDB = patientAuthMapper.selectPswById(patientId);
        if (!pswMD5FromDB.equals(pswMD5)){
            return null;
        }
        LoginVO loginVO = new LoginVO();

        LocalDateTime now = LocalDateTime.now();

        PatientLogin patientLogin = new PatientLogin();
        patientLogin.setPatientId(patientId);
        patientLogin.setLoginTime(now);

        // 插入登录记录
        if (patientLoginMapper.insert(patientLogin) > 0) {
            String token = genNewToken(System.currentTimeMillis() + "", patientId);
            // 存入redis set
            redisCache.setSetObject(USER_ID_TOKEN_KEY + patientId, token, TOKEN_EXPIRED_TIME, TimeUnit.MILLISECONDS);
            loginVO.setToken(token);
            loginVO.setUserId(patientId);
        }
        return loginVO;
    }

    @Override
    public Boolean logout(String patientId, String token) {
        redisCache.deleteObject(USER_ID_TOKEN_KEY + patientId, token);
        return true;
    }

    private String genNewToken(String timeStr, String userId) {
        String src = timeStr + userId + NumberUtil.genRandomNum(4);
        return TokenUtil.genToken(src);
    }
}
