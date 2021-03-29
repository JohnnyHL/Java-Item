package com.hl.magic.dpattern.dp1strategy.demo06.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck6;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.FlyNoWay;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.MuteQuack;

public class DecoyDuck extends BaseDuck6 {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }
}
