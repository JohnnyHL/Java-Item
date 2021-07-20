package com.hl.magic.items.day12.exceptions;

/**
 * Java异常
 *
 * @author hl
 * @date 2021/1/5 10:28
 */
public class GlobalConsoleException extends ServerException {

    /**
     * 错误码
     */
    private int errCode;
    /**
     * 错误描述(英文)
     */
    private String desc;
    /**
     * 错误描述(中文)
     */
    private String descCN;

    public GlobalConsoleException() {
    }

    public GlobalConsoleException(int errCode, String desc) {
        this.errCode = errCode;
        this.desc = desc;
    }

    public GlobalConsoleException(int errCode, String desc, String descCN) {
        this.errCode = errCode;
        this.desc = desc;
        this.descCN = descCN;
    }

    public GlobalConsoleException(String message) {
        super(message);
    }

    public GlobalConsoleException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobalConsoleException(Throwable cause) {
        super(cause);
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDescCN() {
        return descCN;
    }

    public void setDescCN(String descCN) {
        this.descCN = descCN;
    }
}
