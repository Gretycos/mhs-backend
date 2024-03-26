package com.mhs.user.web.param;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @Author Tsong
 * @Date 26/03/2024 03:08
 */
@Data
public class UserLogoutParam {
    @NotEmpty(message = "id cannot be null")
    @Length(max = 32,message = "id is invalid")
    private String userId;

    @NotEmpty(message = "token cannot be null")
    @Length(max = 32,message = "token is invalid")
    private String token;
}
