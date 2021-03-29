package com.hl.magic.dpattern.dp1strategy.demo06.service.impl;

import com.hl.magic.dpattern.dp1strategy.demo06.service.IQuackBehavior;

/**
 * 功能：鸭子吱吱叫
 *
 * @author hl
 */
public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱地叫");
    }
}
