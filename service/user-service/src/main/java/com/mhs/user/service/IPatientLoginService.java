package com.mhs.user.service;

import com.mhs.entity.user.PatientLogin;
import com.mhs.user.web.vo.LoginVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Tsong
 * @since 2024-03-25
 */
public interface IPatientLoginService {
    LoginVO login(String email, String pswMD5);
    Boolean logout(String patientId, String token);
}
