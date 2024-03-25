package com.mhs.entity.management;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
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
@TableName("tb_work_shift")
public class WorkShift {

    /**
     * shift identifier
     */
    @TableId("shift_id")
    private String shiftId;

    /**
     * admin identifier
     */
    private String adminId;

    /**
     * practitioner identifier
     */
    private String practId;

    /**
     * day which need arrange
     */
    private LocalDate workDate;

    /**
     * Working hours, morning or afternoon
     */
    private Byte shiftType;
}
