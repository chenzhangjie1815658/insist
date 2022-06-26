package com.czj.mall.util;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class RespResult<T> implements Serializable {

    //响应数据结果
    private T data;

    //响应码
    private Integer code;

    //响应信息
    private String message;

    public RespResult(Integer code) {
        this.code = code;
    }
    public RespResult(RespCode respCode) {
        this.code = respCode.getCode();
        this.message = respCode.getMessage();
    }

    public RespResult(T data,RespCode respCode) {
        this.data = data;
        this.code = respCode.getCode();
        this.message = respCode.getMessage();
    }

    public static RespResult ok() {
        return new RespResult(null, RespCode.SUCCESS);
    }
    public static RespResult ok(Object data) {
        return new RespResult(data, RespCode.SUCCESS);
    }
    public static RespResult error() {
        return new RespResult(null, RespCode.ERROR);
    }
    public static RespResult error(String message) {
        return secByError(RespCode.ERROR.getCode(),message);
    }
    //自定义异常
    public static RespResult secByError(Integer code,String message) {
        RespResult err = new RespResult();
        err.setCode(code);
        err.setMessage(message);
        return err;
    }
    public static RespResult error(RespCode resultCode) {
        return new RespResult(resultCode);
    }
}
