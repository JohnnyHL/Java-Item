package com.hl.magic.items.day09.oop.character01;

/**
 * 白富美
 *
 * @author hl
 */
public class Woman {
    /**
     * 姓名
     */
    public String name;
    /**
     * 丈夫
     */
    public Man husband;

    /**
     * 肯定也得结婚
     */
    public void marry(Man man) {
        this.husband = man;
    }
}
