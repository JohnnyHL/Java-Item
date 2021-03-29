package com.hl.magic.dpattern.dp1strategy.demo03.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck3;

/**
 * 红毛鸭
 *
 * @author hl
 */
public class RedheadDuck extends BaseDuck3 {
    @Override
    public void display() {
        System.out.println("外观：红毛鸭");
    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("红毛鸭子起飞");
    }
}
