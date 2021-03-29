package com.hl.magic.dpattern.dp1strategy.demo05.entity;

import com.hl.magic.dpattern.dp1strategy.demo04.service.Flayable;
import com.hl.magic.dpattern.dp1strategy.demo04.service.Quackable;
import com.hl.magic.dpattern.dp1strategy.base.BaseDuck5;
import com.hl.magic.dpattern.dp1strategy.demo05.service.impl.FlyNoWay;
import com.hl.magic.dpattern.dp1strategy.demo05.service.impl.Squeak;

/**
 * 橡皮鸭
 *
 * @author hl
 */
public class RubberDuck extends BaseDuck5 implements Flayable, Quackable {
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
        System.out.println("橡皮鸭子要倒着起飞");
    }

    @Override
    public void quack() {
        System.out.println("橡皮鸭子还要叫出猪叫的声音来");
    }

    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}
