package com.hl.magic.dpattern.dp1strategy.demo05.service.impl;

import com.hl.magic.dpattern.dp1strategy.demo05.service.IQuackBehavior;

/**
 * 定义：quack接口的一个实现类
 * 功能：实现鸭子呱呱叫的功能
 *
 * @author hl
 */
public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱的叫");
    }
}
