package com.hl.magic.dpattern.dp1strategy.demo05.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck5;
import com.hl.magic.dpattern.dp1strategy.demo05.service.impl.FlyNoWay;

/**
 * 我们开又定义了一只诱饵鸭子，动作是啥样暂且不管，预留着，将来成熟了在附加新技能进来
 *
 * @author hl
 */
public class DecoyDuck extends BaseDuck5 {
    public DecoyDuck() {
        /**
         * 要求诱饵鸭不能鸣叫
         */
        quackBehavior = new MuteQuack();
        /**
         * 要求诱饵鸭不能飞翔
         */
        flyBehavior = new FlyNoWay();
    }

    /**
     * 诱饵鸭外观展示
     */
    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }

    public static void main(String[] args) {
        DecoyDuck decoyDuck = new DecoyDuck();
        System.out.println("============诱饵鸭=========");
        decoyDuck.flyBehavior.fly();
        decoyDuck.quackBehavior.quack();
    }
}
