package com.hl.magic.dpattern.dp1strategy.demo03.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck3;

/**
 * 绿毛鸭
 * @author hl
 */
public class MallarDuck extends BaseDuck3 {
    @Override
    public void display() {
        System.out.println("外观：绿毛");
    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("起飞了，绿毛鸭");
    }
}
