package com.mhs.user.mapper.dto;

import lombok.Data;

/**
 * @Author Tsong
 * @Date 25/03/2024 23:59
 */
@Data
public class PatientLoginDTO {
    String patientId;
    Byte isDeleted;
}
