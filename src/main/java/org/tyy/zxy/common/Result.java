package org.tyy.zxy.common;

import lombok.Data;

@Data
public class Result <T>{
    private Integer code;
    private String message;
    private T data;
    public Result(){}
    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回
     * @param data 数据
     * @return {@code Result}
     */
    public static <T>Result<T> success(T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回
     * @param message 成功信息
     * @param data 数据
     * @return {@code Result}
     */
    public static <T>Result<T> success(String message,T data){
        return new Result<>(ResultCode.SUCCESS.getCode(), message,data);
    }

    /**
     * 失败返回
     * @return {@code Result}
     * @param message 报错信息
     */
    public static <T> Result<T> fail(String message){
        return new Result<>(ResultCode.FAIL.getCode(), message,null);
    }

    /**
     * 错误返回
     * @param code  报错码
     * @param message 报错信息
     * @return {@code Result}
     */
    public static <T> Result<T> fail(Integer code,String message){
        return new Result<>(code, message,null);
    }
}
