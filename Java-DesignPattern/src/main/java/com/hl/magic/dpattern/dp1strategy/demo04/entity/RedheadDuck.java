package com.hl.magic.dpattern.dp1strategy.demo04.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck4;
import com.hl.magic.dpattern.dp1strategy.demo04.service.Flayable;
import com.hl.magic.dpattern.dp1strategy.demo04.service.Quackable;

/**
 * 红毛鸭
 * 继承父类的外观，实现鸣叫和飞翔行为
 *
 * @author hl
 */
public class RedheadDuck extends BaseDuck4 implements Flayable, Quackable {
    @Override
    public void display() {
        System.out.println("外观：红毛鸭");
    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("红毛鸭子起飞");
    }
}
