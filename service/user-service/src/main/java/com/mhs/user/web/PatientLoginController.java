package com.mhs.user.web;

import com.mhs.common.enums.user.UserServiceResultEnum;
import com.mhs.common.util.Result;
import com.mhs.common.util.ResultGenerator;
import com.mhs.user.service.IPatientLoginService;
import com.mhs.user.web.param.UserLoginParam;
import com.mhs.user.web.param.UserLogoutParam;
import com.mhs.user.web.vo.LoginVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Tsong
 * @since 2024-03-25
 */
@RestController
@RequestMapping("/api/user")
public class PatientLoginController {
    @Autowired
    private IPatientLoginService patientLoginService;

    @PostMapping("/login")
    public Result login(@RequestBody @Valid UserLoginParam userLoginParam) {
        LoginVO loginVO = patientLoginService.login(userLoginParam.getEmail(), userLoginParam.getPasswordMd5());
        if (loginVO != null){
            return ResultGenerator.genSuccessResult(loginVO);
        }
        return ResultGenerator.genFailResult(UserServiceResultEnum.LOGIN_ERROR.getResult());
    }

    @PostMapping("/logout")
    public Result logout(@RequestBody @Valid UserLogoutParam userLogoutParam) {
        patientLoginService.logout(userLogoutParam.getUserId(), userLogoutParam.getToken());
        return ResultGenerator.genSuccessResult();
    }
}
