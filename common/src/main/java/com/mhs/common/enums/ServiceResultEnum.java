package com.mhs.common.enums;

import lombok.Getter;

/**
 * @Author Tsong
 * @Date 13/03/2024 18:31
 */
@Getter
public enum ServiceResultEnum {
    NOT_LOGIN_ERROR("Not logged in"),

    TOKEN_EXPIRE_ERROR("Token expired. Please log in again.");

    private String result;
    ServiceResultEnum(String result) {
        this.result = result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
