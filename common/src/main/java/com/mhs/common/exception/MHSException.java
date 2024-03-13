package com.mhs.common.exception;

/**
 * 封装异常类
 * @Author Tsong
 * @Date 3/13/2024 13:26
 */
public class MHSException extends RuntimeException{
    public MHSException() {
    }

    public MHSException(String message) {
        super(message);
    }

    /**
     * @Description 丢出一个异常
     * @Param [message]
     * @Return void
     */
    public static void fail(String message) {
        throw new MHSException(message);
    }
}
