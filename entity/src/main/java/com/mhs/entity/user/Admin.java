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
@TableName("tb_admin")
public class Admin {

    /**
     * administrator id
     */
    @TableId("admin_id")
    private String adminId;

    /**
     * admin email
     */
    private String email;

    /**
     * admin given name
     */
    private String givenName;

    /**
     * admin family name
     */
    private String familyName;

    /**
     * time when created
     */
    private LocalDateTime createdTime;

    /**
     * time when updated
     */
    private LocalDateTime updatedTime;

    /**
     * is the account closed
     */
    private Byte isDeleted;
}
