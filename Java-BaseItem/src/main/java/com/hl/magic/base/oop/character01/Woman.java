package com.hl.magic.base.oop.character01;

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
    public base.oop.character01.Man husband;

    /**
     * 肯定也得结婚
     */
    public void marry(base.oop.character01.Man man) {
        this.husband = man;
    }
}
