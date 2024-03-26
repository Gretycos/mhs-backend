package com.mhs.common.constant.user;

import static com.mhs.common.constant.Constant.REDIS_KEY_PREFIX;

/**
 * @Author Tsong
 * @Date 26/03/2024 00:46
 */
public class UserConstant {
    public final static long TOKEN_EXPIRED_TIME = 14L * 24 * 3600 * 1000; // 14天过期
    public static final String USER_ID_TOKEN_KEY = REDIS_KEY_PREFIX + "user_id_token:";
}
