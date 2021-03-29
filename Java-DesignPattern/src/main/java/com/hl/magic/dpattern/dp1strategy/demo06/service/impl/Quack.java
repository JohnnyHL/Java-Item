package com.hl.magic.dpattern.dp1strategy.demo06.service.impl;

import com.hl.magic.dpattern.dp1strategy.demo06.service.IQuackBehavior;

/**
 * 功能：鸭子呱呱叫
 *
 * @author hl
 */
public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱的叫");
    }
}
