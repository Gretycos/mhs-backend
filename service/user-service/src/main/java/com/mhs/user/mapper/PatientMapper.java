package com.mhs.user.mapper;

import com.mhs.entity.user.Patient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mhs.user.mapper.dto.PatientLoginDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Tsong
 * @since 2024-03-25
 */
public interface PatientMapper extends BaseMapper<Patient> {
    @Select("""
    select patient_id, is_deleted
    from tb_patient
    where email = #{email}
    """)
    PatientLoginDTO selectIdByEmail(@Param("email") String email);
}
