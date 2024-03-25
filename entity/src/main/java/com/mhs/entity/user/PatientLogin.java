package com.mhs.entity.user;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Tsong
 * @since 2024-03-25
 */
@Getter
@Setter
@TableName("tb_patient_login")
public class PatientLogin {

    /**
     * patient identifier
     */
    private String patientId;

    /**
     * time when signingin
     */
    private LocalDateTime loginTime;

    /**
     * ip address
     */
    private String ip;
}
