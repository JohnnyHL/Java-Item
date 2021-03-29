package com.hl.magic.dpattern.dp1strategy.demo05.entity;


import com.hl.magic.dpattern.dp1strategy.base.BaseDuck5;
import com.hl.magic.dpattern.dp1strategy.demo05.service.IFlyBehavior;
import com.hl.magic.dpattern.dp1strategy.demo05.service.impl.FlyWithWings;
import com.hl.magic.dpattern.dp1strategy.demo05.service.impl.Quack;

/**
 * 红头鸭继承父类鸭子
 *
 * @author hl
 */
public class RedDuck extends BaseDuck5 implements IFlyBehavior {
    /**
     * 无参构造方法
     * 多态方式
     */
    public RedDuck() {
        /**
         * 要求红毛鸭能够呱呱叫
         */
        quackBehavior = new Quack();
        /**
         * 要求红毛鸭能够盘旋着飞
         */
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观：红毛鸭");
    }
    /**
     * 重写父类方法
     *
     * 红毛鸭要自己飞翔，翻滚着飞
     */
    @Override
    public void fly() {
        System.out.println("这只红毛鸭子要翻滚着飞翔");
    }

    public static void main(String[] args) {
        RedDuck redDuck = new RedDuck();
        redDuck.fly();
    }
}
