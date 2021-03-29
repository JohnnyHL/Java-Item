package com.hl.magic.dpattern.dp1strategy.demo04.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck4;
import com.hl.magic.dpattern.dp1strategy.demo04.service.Flayable;
import com.hl.magic.dpattern.dp1strategy.demo04.service.Quackable;

/**
 * 橡皮鸭
 * 继承父类的外观，实现鸣叫行为
 *
 * @author hl
 */
public class RubberDuck extends BaseDuck4 implements Flayable, Quackable {

    @Override
    public void display() {
        System.out.println("外观：橡皮鸭");
    }

    @Override
    public void fly() {
        System.out.println("橡皮鸭子起飞");
    }

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
