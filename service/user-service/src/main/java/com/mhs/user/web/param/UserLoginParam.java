package com.mhs.user.web.param;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @Author Tsong
 * @Date 25/03/2024 21:26
 */
@Data
public class UserLoginParam {
    @NotEmpty(message = "email cannot be null")
    @Length(max = 32,message = "email is too long")
    @Email
    private String email;

    @NotEmpty(message = "password cannot be null")
    @Length(max = 32,message = "password is too long")
    private String passwordMd5;
}
