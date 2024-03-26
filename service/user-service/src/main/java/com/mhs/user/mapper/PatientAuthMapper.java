package com.mhs.user.mapper;

import com.mhs.entity.user.PatientAuth;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Tsong
 * @since 2024-03-25
 */
public interface PatientAuthMapper extends BaseMapper<PatientAuth> {
    @Select("""
    select password
    from tb_patient_auth
    where patient_id = #{patientId} and is_deleted = 0
    """)
    String selectPswById(@Param("patientId") String patientId);
}
