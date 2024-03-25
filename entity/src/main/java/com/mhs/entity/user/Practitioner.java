package com.mhs.entity.user;

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
@TableName("tb_practitioner")
public class Practitioner {

    private String practId;

    private String givenName;

    private String familyName;

    private LocalDateTime dateOfBirth;

    private String role;

    private String email;

    private String sex;
}
