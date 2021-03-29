package com.hl.magic.dpattern.dp1strategy.demo05.service.impl;

import com.hl.magic.dpattern.dp1strategy.demo05.service.IFlyBehavior;

/**
 * 定义：fly接口的一个实现类
 * 功能：保持鸭子不会飞行为
 *
 * @author hl
 */
public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞，打死都不会飞的");
    }
}
