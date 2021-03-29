package com.hl.magic.dpattern.dp1strategy.demo03.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck3;

/**
 * 橡皮鸭
 *
 * @author hl
 */
public class RubberDuck extends BaseDuck3 {

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("外观：橡皮鸭");
    }

    @Override
    public void fly() {
        //不会飞
    }
}
