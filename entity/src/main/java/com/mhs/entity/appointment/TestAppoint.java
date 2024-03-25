package com.mhs.entity.appointment;

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
@TableName("tb_test_appoint")
public class TestAppoint {

    /**
     * test appointment identifier
     */
    @TableId("test_appoint_id")
    private String testAppointId;

    /**
     * patient identifier
     */
    private String patientId;

    /**
     * practitioner identifier
     */
    private String practId;

    /**
     * time which appointed by patient
     */
    private LocalDateTime testAppointTime;

    /**
     * test type
     */
    private Byte testType;
}
