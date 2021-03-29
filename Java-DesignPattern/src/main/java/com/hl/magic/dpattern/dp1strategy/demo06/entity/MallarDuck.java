package com.hl.magic.dpattern.dp1strategy.demo06.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck6;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.FlyWithWings;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.Quack;

public class MallarDuck extends BaseDuck6 {
    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观：绿毛鸭");
    }
}
