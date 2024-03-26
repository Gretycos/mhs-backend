package com.mhs.common.enums.user;

import lombok.Getter;

/**
 * @Author Tsong
 * @Date 25/03/2024 21:54
 */
@Getter
public enum UserServiceResultEnum {
    LOGIN_ERROR("Email or password error."),

    LOGIN_USER_LOCKED_ERROR("Your account has been locked."),

    NOT_LOGIN_ERROR("Not logged in"),

    TOKEN_EXPIRE_ERROR("Token expired. Please log in again.");

    private String result;
    UserServiceResultEnum(String result) {
        this.result = result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
