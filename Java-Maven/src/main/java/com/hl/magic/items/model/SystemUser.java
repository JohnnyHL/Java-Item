package com.hl.magic.items.model;

import com.hl.magic.items.comman.BaseModel;

/**
 * 实体类--系统用户
 *
 * @author hl
 * @date 2020/3/14 20:19
 */
public class SystemUser extends BaseModel {

    private String id;
    private String userName;
    private String password;

    public SystemUser(String id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
