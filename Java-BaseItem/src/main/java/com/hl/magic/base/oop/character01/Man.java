package com.hl.magic.base.oop.character01;

/**
 *
 * @author hl
 */
public class Man {
    /**
     * 姓名
     */
    public String name;
    /**
     * 妻子
     */
    public Woman wife;
    /**
     * 存款
     */
    public double money;

    /**
     * 结婚
     */
    public void marry(Woman woman) {
        this.wife = woman;
    }
}
