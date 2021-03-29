package com.hl.magic.dpattern.dp1strategy.demo06.service.impl;

import com.hl.magic.dpattern.dp1strategy.demo06.service.IQuackBehavior;

/**
 * 功能：鸭子不会叫
 *
 * @author hl
 */
public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("什么都不会做，不会叫");
    }
}
