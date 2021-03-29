package com.hl.magic.dpattern.dp1strategy.demo03.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck3;

/**
 * 诱饵鸭
 *
 * @author hl
 */
public class DecoyDuck extends BaseDuck3 {
    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }

    @Override
    public void quack() {
        //不会叫
    }

    @Override
    public void fly() {
        //不会飞
    }
}
