package com.hl.magic.items.comman;

/**
 * 控制器响应结果实体类，返回接口调用信息描述
 * @author hl
 */
public class ResponseMessage extends BaseModel {

    private static final long serialVersionUID = -7127875856370230011L;

    /**
     * 状态
     */
    private int status = 20000;
    /**
     * 消息说明
     */
    private String message;
    /**
     * 数据信息
     */
    private Object data;

    public ResponseMessage() {
    }

    public ResponseMessage(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseMessage(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
