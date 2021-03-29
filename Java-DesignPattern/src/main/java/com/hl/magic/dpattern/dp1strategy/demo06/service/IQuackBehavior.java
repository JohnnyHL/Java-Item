package com.hl.magic.dpattern.dp1strategy.demo06.service;

/**
 * 将鸭子叫的行为剥离出来，作为鸣叫quack接口，提供实现类
 * 1.吱吱地叫
 * 2.呱呱地叫
 * 3.啥都不会做，也不会叫，
 * <p>
 * 提供共性的接口，至于鸭子怎么鸣叫，可自行实现鸣叫方式即可。
 *
 * @author hl
 */
public interface IQuackBehavior {
    /**
     * 鸣叫
     */
    void quack();
}
