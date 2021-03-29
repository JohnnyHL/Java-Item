package com.hl.magic.dpattern.dp1strategy.demo05.service;

/**
 * 将鸭子叫的行为剥离出来，作为鸣叫quack接口，提供三个实现类
 * (也可以是多个实现类，只要鸭子叫的方式不一样就可以作为实现类来实现本接口)
 * 1.吱吱地叫
 * 2.呱呱地叫
 * 3.啥都不会做，也不会叫
 *
 * @author hl
 */
public interface IQuackBehavior {
    /**
     * 鸣叫
     */
    void quack();
}
