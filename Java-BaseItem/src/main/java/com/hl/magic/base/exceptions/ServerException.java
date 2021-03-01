package com.hl.magic.base.exceptions;

/**
 * 服务异常
 * 服务类出现业务逻辑错误，需要向前端返回错误提示时，使用该异常包装错误提示信息
 *
 * @author hl
 * @date 2021/1/5 10:20
 */
public class ServerException extends RuntimeException {

    public ServerException() {
    }

    public ServerException(String message) {
        super(message);
    }

    public ServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerException(Throwable cause) {
        super(cause);
    }
}
