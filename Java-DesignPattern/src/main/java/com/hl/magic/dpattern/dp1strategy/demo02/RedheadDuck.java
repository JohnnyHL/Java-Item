package com.hl.magic.dpattern.dp1strategy.demo02;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck2;

/**
 * 红毛鸭
 *
 * @author hl
 */
public class RedheadDuck extends BaseDuck2 {
    @Override
    public void display() {
        System.out.println("外观：红毛鸭");
    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    /**
     * 继承/重载了父类鸭子的起飞功能
     */
    @Override
    public void fly() {
        System.out.println("红毛鸭子起飞");
    }
}
