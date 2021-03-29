package com.hl.magic.dpattern.dp1strategy.demo06.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck6;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.FlyNoWay;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.Quack;

/**
 * 新增一只模型鸭子，需要继承父类鸭子属性
 * @author Administrator A
 */
public class ModelDuck extends BaseDuck6 {
    /**
     * 这只模型鸭子会飞、叫
     * 怎么飞/叫，就看模型鸭选择那种实现类了。
     * 暂且给鸭子选择“叫”和“起飞”的方式。
     */
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观：模型鸭");
    }
}
