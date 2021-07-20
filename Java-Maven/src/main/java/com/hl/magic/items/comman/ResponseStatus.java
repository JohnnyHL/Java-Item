package com.hl.magic.items.comman;

/**
 * 消息状态
 * @author hl
 * @date 2019-09-10
 */
public enum ResponseStatus {
    /**
     * 操作成功
     */
    SUCCESS(20000, "操作成功"),
    /**
     * 操作失败
     */
    FAILURE(50000, "操作失败"),
    /**
     * 请求错误
     */
    REQUEST_ERROR(100, "请求错误"),
    /**
     * 请求方法不支持
     */
    REQUEST_METHOD_NOT_SUPPORT_ERROR(101, "请求方法不支持"),
    /**
     * 身份认证类错误
     */
    AUTHORIZED_ERROR(200, "身份认证失败"),
    /**
     * Rest服务错误
     */
    REST_SERVICE_ERROR(300, "Rest服务错误"),
    REST_SERVICE_INVOKE_ERROR(302, "Rest服务调用错误"),
    /**
     * 数据库错误
     */
    DB_CONNECT_ERROR(400, "数据库连接错误"),
    DB_SQL_ERROR(401, "SQL执行错误"),
    /**
     * 服务端程序错误
     */
    SERVER_INTERNAL_ERROR(500, "服务端内部错误"),
    /**
     * 服务类错误
     */
    SERVICE_EXCEPTION(600, "业务逻辑错误");

    /**
     * 响应码
     */
    private int status;
    /**
     * 描述信息
     */
    private String message;

    ResponseStatus() {
    }

    ResponseStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
