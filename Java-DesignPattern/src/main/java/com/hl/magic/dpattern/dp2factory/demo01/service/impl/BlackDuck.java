package com.hl.magic.dpattern.dp2factory.demo01.service.impl;

import com.hl.magic.dpattern.dp2factory.demo01.service.IDuck;

/**
 * @author hl
 */
public class BlackDuck implements IDuck {
    @Override
    public void swim() {
        System.out.println("黑毛鸭子会下河游泳");
    }

    @Override
    public void walk() {
        System.out.println("黑毛鸭子会外出活动");
    }

    @Override
    public void forage() {
        System.out.println("黑毛鸭子会外出觅食");
    }
}
