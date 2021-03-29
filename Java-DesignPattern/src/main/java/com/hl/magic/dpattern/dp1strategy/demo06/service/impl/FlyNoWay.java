package com.hl.magic.dpattern.dp1strategy.demo06.service.impl;

import com.hl.magic.dpattern.dp1strategy.demo06.service.IFlyBehavior;

/**
 * 功能：鸭子不会飞翔
 *
 * @author hl
 */
public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞，打死都不会飞的");
    }
}
