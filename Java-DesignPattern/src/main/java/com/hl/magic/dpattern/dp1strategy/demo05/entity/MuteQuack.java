package com.hl.magic.dpattern.dp1strategy.demo05.entity;

import com.hl.magic.dpattern.dp1strategy.demo05.service.IQuackBehavior;

/**
 * quack接口的一个实现类：鸭子啥都不会做，就是不会叫
 *
 * @author hl
 */
public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("什么都不会做，不会叫");
    }
}
