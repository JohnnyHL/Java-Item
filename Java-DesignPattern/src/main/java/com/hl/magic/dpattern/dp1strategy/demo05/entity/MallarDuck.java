package com.hl.magic.dpattern.dp1strategy.demo05.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck5;
import com.hl.magic.dpattern.dp1strategy.demo05.service.impl.FlyWithWings;
import com.hl.magic.dpattern.dp1strategy.demo05.service.impl.Quack;

/**
 * 定义好父类鸭子、行为接口、实现类后
 * 我们开始生产鸭子了，定义一只绿毛鸭子，动作是啥样暂且不管，预留着，将来成熟了在附加新技能进来
 *
 * @author hl
 */
public class MallarDuck extends BaseDuck5 {
    public MallarDuck() {
        /**
         * 要求绿毛衣能呱呱叫
         */
        quackBehavior = new Quack();
        /**
         * 要求绿毛衣能盘旋着飞翔
         */
        flyBehavior = new FlyWithWings();
    }

    /**
     * 绿毛鸭外观展示
     */
    @Override
    public void display() {
        System.out.println("外观：绿毛鸭");
    }

    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.flyBehavior.fly();
    }
}
