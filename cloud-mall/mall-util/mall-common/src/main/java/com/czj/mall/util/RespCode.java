package com.czj.mall.util;

public enum RespCode {
    SUCCESS(0, "操作成功"),
    ERROR(1, "操作失败"),
    SYSTEM_ERROR(-1, "系统错误");
    private Integer code;
    private String message;

    RespCode() {
    }

    RespCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
