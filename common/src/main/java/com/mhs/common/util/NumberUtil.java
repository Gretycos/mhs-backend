package com.mhs.common.util;

/**
 * @Author Tsong
 * @Date 26/03/2024 00:11
 */
public class NumberUtil {
    /**
     * @Description 生成指定长度的随机数
     * @Param [length]
     * @Return int
     */
    public static int genRandomNum(int length) {
        int num = 1;
        double random = Math.random();
        if (random < 0.1) {
            random = random + 0.1;
        }
        for (int i = 0; i < length; i++) {
            num = num * 10;
        }
        return (int) ((random * num));
    }
}
