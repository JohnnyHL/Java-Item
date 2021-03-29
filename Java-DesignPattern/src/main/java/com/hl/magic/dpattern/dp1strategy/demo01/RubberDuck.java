package com.hl.magic.dpattern.dp1strategy.demo01;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck1;

/**
 * 橡皮鸭子
 *
 * @author hl
 */
public class RubberDuck extends BaseDuck1 {
    @Override
    public void display() {
        System.out.println("外观：橡皮鸭");
    }

    @Override
    public void quack() {
        System.out.println("叫声：吱吱叫");
    }
}
