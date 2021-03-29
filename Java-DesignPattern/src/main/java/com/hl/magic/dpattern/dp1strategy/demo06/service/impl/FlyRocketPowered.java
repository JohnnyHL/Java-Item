package com.hl.magic.dpattern.dp1strategy.demo06.service.impl;

import com.hl.magic.dpattern.dp1strategy.demo06.service.IFlyBehavior;

/**
 * 功能：鸭子想用火箭飞的方式飞翔
 *
 * @author hl
 */
public class FlyRocketPowered implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("这只鸭子要用火箭飞");
    }
}
