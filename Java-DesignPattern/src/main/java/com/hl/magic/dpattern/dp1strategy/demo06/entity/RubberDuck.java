package com.hl.magic.dpattern.dp1strategy.demo06.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck6;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.FlyNoWay;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.Squeak;

public class RubberDuck extends BaseDuck6 {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观：橡皮鸭");
    }
}
