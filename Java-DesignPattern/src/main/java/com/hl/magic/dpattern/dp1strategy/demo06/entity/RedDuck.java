package com.hl.magic.dpattern.dp1strategy.demo06.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck6;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.FlyWithWings;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.Quack;

/**
 * 红头鸭继承父类鸭子
 */
public class RedDuck extends BaseDuck6 {
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
}
