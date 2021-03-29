package com.hl.magic.dpattern.dp1strategy.demo05.service.impl;

import com.hl.magic.dpattern.dp1strategy.demo05.service.IFlyBehavior;

/**
 * 定义：fly接口的一个实现类
 * 功能：实现鸭子盘旋着飞的功能
 *
 * @author Administrator
 */
public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("会飞，盘旋着飞");
    }
}
