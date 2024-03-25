package com.mhs.entity.management;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("tb_admin_log")
public class AdminLog {

    /**
     * admin identifier
     */
    @TableId(value = "log_id", type = IdType.AUTO)
    private Long logId;

    /**
     * admin login time
     */
    private LocalDateTime logTime;

    /**
     * practitioner identifier
     */
    private String practId;

    /**
     * admin identifier
     */
    private String adminId;

    /**
     * admin's operation type
     */
    private Byte opType;
}
