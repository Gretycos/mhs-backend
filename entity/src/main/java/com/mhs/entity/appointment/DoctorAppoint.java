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
@TableName("tb_doctor_appoint")
public class DoctorAppoint {

    /**
     * doctor appointment identifier
     */
    @TableId("doctor_appoint_id")
    private String doctorAppointId;

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
    private LocalDateTime doctorAppointTime;

    /**
     * appointment type
     */
    private Byte doctorAppointType;

    /**
     * reason for appointment
     */
    private String reason;
}
