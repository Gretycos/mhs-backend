package com.mhs.entity.user;

import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("tb_patient")
public class Patient {

    /**
     * patient identifier
     */
    @TableId("patient_id")
    private String patientId;

    /**
     * email address
     */
    private String email;

    /**
     * last name
     */
    private String givenName;

    /**
     * the rest of name
     */
    private String familyName;

    /**
     * binary gender
     */
    private Byte sex;

    /**
     * id of the address
     */
    private String addressId;

    /**
     * mobile number
     */
    private String mobileNum;

    /**
     * for age
     */
    private LocalDateTime dateOfBirth;

    /**
     * is the account closed
     */
    private Byte isDeleted;

    /**
     * time when created
     */
    private LocalDateTime createdTime;

    /**
     * time when updated
     */
    private LocalDateTime updatedTime;
}
