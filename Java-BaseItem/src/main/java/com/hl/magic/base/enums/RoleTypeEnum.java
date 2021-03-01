package com.hl.magic.base.enums;

/**
 * 角色类型枚举类
 *
 * @author hl
 * @date 2020/1/8
 */
public enum RoleTypeEnum {

    ADMIN(1, "管理员"),
    OPERATOR(2, "操作员"),
    AUDIT(3, "审计员"),
    BUSS(4, "业务员"),
    OTHER(5, "其他");

    private String name;

    private int code;

    private String remark;

    RoleTypeEnum() {
    }

    RoleTypeEnum(int code, String remark) {
        this.code = code;
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
