package com.hl.magic.dpattern.dp2factory.demo01.service;

/**
 * 定义一个鸭子总类。具备以下基本行为动作。
 *
 * @author hl
 * @date 2021/3/26 14:42
 */
public interface IDuck {
    /**
     * 游泳
     */
    void swim();
    /**
     * 活动
     */
    void walk();
    /**
     * 觅食
     */
    void forage();
}
