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
@TableName("tb_patient_addr")
public class PatientAddr {

    /**
     * address identifier
     */
    @TableId("addr_id")
    private Integer addrId;

    /**
     * patient id
     */
    private String patientId;

    /**
     * street
     */
    private String addr1;

    /**
     * flat
     */
    private String addr2;

    /**
     * city
     */
    private String city;

    /**
     * post code
     */
    private String postCode;

    /**
     * is deleted
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
