package com.mhs.user.service.impl;

import com.mhs.entity.user.Patient;
import com.mhs.user.mapper.PatientMapper;
import com.mhs.user.service.IPatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Tsong
 * @since 2024-03-25
 */
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements IPatientService {

}
