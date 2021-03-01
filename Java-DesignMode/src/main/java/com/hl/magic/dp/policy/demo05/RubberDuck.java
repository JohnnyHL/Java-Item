package com.hl.magic.dp.policy.demo05;

import com.hl.magic.dp.policy.demo04.Flayable;
import com.hl.magic.dp.policy.demo04.Quackable;

public class RubberDuck extends Duck implements Flayable, Quackable {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观：橡皮鸭");
    }

    @Override
    public void fly() {
        System.out.println("橡皮鸭子也要起飞了");
    }

    @Override
    public void quack() {
        System.out.println("橡皮鸭子还要叫出声来");
    }
}
