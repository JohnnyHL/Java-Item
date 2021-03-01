package com.hl.magic.base.basecode.enums;

/**
 * 用户角色枚举类
 *
 * @author hl
 * @date 2019/9/20
 */
public enum UserEnum {

    USER_ADMIN("admin", new Integer[]{1}, "超级管理员"),
    USER_SECURITY("security", new Integer[]{3}, "安全员"),
    USER_AUDIT("audit", new Integer[]{5}, "审计员"),
    USER_MANAGER("manager", new Integer[]{10, 11, 12}, "管理员"),
    ;

    /**
     * 用户代码
     */
    private String usercode;

    /**
     * 角色代码
     */
    private Integer[] roleCode;

    /**
     * 用户中文名称
     */
    private String userName;

    UserEnum() {
    }

    UserEnum(String usercode, Integer[] roleCode, String userName) {
        this.usercode = usercode;
        this.roleCode = roleCode;
        this.userName = userName;
    }

    public static void initByUserName(String userName) {
        UserEnum userEnum = null;
        UserEnum[] userEnums = new UserEnum[]{UserEnum.USER_ADMIN, UserEnum.USER_SECURITY, UserEnum.USER_AUDIT, UserEnum.USER_MANAGER};
        if (null != userEnums && 0 < userEnums.length) {
            for (int i = 0; i < userEnums.length; i++) {
                String uName = userEnums[i].getUserName();
                if (uName.equalsIgnoreCase(userName)) {
                    userEnum = userEnums[i];
                    break;
                }
            }
        }
    }

    public static void initByUserCode(String usercode) {
        UserEnum userEnum = null;
        UserEnum[] userEnums = UserEnum.values();
        if (null != userEnums && 0 < userEnums.length) {
            for (int i = 0; i < userEnums.length; i++) {
                String uCode = userEnums[i].getUsercode();
                if (uCode.equalsIgnoreCase(usercode)) {
                    userEnum = userEnums[i];
                    break;
                }
            }
        }

    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public Integer[] getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(Integer[] roleCode) {
        this.roleCode = roleCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
