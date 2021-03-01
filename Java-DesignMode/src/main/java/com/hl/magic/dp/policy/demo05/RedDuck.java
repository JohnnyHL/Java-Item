package com.hl.magic.dp.policy.demo05;


import com.hl.magic.dp.policy.demo04.Flayable;

/**
 * 红头鸭继承父类鸭子
 */
public class RedDuck extends Duck implements Flayable {
    /**
     * 无参构造方法
     * 多态方式
     */
    public RedDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观：红毛鸭");
    }

    @Override
    public void fly() {
        System.out.println("这只红毛鸭子要起飞了");
    }
}
