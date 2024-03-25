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
@TableName("tb_patient_auth")
public class PatientAuth {

    /**
     * patient identifier
     */
    private String patientId;

    /**
     * encrypted password
     */
    private String password;

    /**
     * is the password deleted
     */
    private Byte isDeleted;

    /**
     * time when created
     */
    private LocalDateTime createdTime;
}
