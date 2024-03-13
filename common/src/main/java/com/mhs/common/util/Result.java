package com.mhs.common.util;

//import io.swagger.v3.oas.annotations.media.Schema;

import lombok.*;

import java.io.Serializable;

/**
 * @Author Tsong
 * @Date 2023/3/31 14:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    //业务码，比如成功、失败、权限不足等 code，可自行定义
    private int resultCode;
    //返回信息，后端在进行业务处理后返回给前端一个提示信息，可自行定义
    private String message;
    //数据结果，泛型，可以是列表、单个对象、数字、布尔值等
    private T data;
}
