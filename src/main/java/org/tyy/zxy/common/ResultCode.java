package org.tyy.zxy.common;

import lombok.Getter;

@Getter
public enum ResultCode {
    SUCCESS(200, "操作成功"),
    FAIL(500, "操作失败"),
    PARAM_ERROR(400, "参数错误"),
    UNAUTHORIZED(401, "未登录"),
    FORBIDDEN(403, "权限不足"),
    NOT_FOUND(404, "资源不存在"),
    FILE_NOT_EXIST(4001, "文件不存在"),
    USER_NOT_EXIST(4002, "用户不存在"),
    PASSWORD_ERROR(4003, "密码错误"),
    STORAGE_NOT_ENOUGH(4004, "存储空间不足"),
    ;

    private final Integer code;
    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
