package com.hl.magic.dpattern.dp2factory.demo01.service.impl;

import com.hl.magic.dpattern.dp2factory.demo01.service.IDuck;

/**
 * @author hl
 */
public class RoastDuck implements IDuck {
    @Override
    public void swim() {
        System.out.println("太神奇了，烤鸭会下河游泳");
    }

    @Override
    public void walk() {
        System.out.println("太神奇了，烤鸭会外出活动");
    }

    @Override
    public void forage() {
        System.out.println("太神奇了，烤鸭会外出觅食");
    }
}
