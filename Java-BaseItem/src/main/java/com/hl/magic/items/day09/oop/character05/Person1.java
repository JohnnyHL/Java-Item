package com.hl.magic.items.day09.oop.character05;

/**
 * Java创建对象的5种方式
 *
 * @author hl
 * @date 2020/9/17 14:39
 */
public class Person1 {
    private String id;
    private String name;
    private String addr;

    public Person1() {
    }

    public Person1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person1(String id, String name, String addr) {
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
