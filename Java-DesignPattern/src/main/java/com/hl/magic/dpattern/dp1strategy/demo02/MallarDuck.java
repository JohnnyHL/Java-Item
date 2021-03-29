package com.hl.magic.dpattern.dp1strategy.demo02;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck2;

/**
 * 绿毛鸭
 *
 * @author hl
 */
public class MallarDuck extends BaseDuck2 {

    @Override
    public void display() {
        System.out.println("外观：绿毛");
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
        System.out.println("起飞了，绿毛鸭");
    }
}
