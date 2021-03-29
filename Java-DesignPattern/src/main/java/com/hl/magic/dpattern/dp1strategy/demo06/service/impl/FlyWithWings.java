package com.hl.magic.dpattern.dp1strategy.demo06.service.impl;

import com.hl.magic.dpattern.dp1strategy.demo06.service.IFlyBehavior;

/**
 * 功能：鸭子盘旋飞翔
 *
 * @author hl
 */
public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("会飞，盘旋着飞");
    }
}
