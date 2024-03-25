package com.mhs.entity.user;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("tb_practitioner_auth")
public class PractitionerAuth {

    @TableId("pract_id")
    private String practId;

    private String password;
}
