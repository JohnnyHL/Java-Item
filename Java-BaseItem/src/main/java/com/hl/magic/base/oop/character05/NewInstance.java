package com.hl.magic.base.oop.character05;

/**
 * Java创建对象的5种方式
 *
 * @author hl
 * @date 2020/9/17 14:39
 */
public class NewInstance {
    private String id;
    private String name;
    private String addr;

    public NewInstance() {

    }

    public NewInstance(String id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
