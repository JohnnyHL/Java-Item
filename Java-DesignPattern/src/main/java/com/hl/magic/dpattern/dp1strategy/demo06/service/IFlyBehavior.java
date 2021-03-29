package com.hl.magic.dpattern.dp1strategy.demo06.service;

/**
 * 将鸭子飞的行为剥离出来，作为fly接口，提供两种子类
 * 1.会飞，盘旋着飞
 * 2.不会飞，打死也不会飞
 * <p>
 * 提供共性的接口，至于鸭子怎么飞翔，可自行实现飞翔方式即可。
 *
 * @author hl
 */
public interface IFlyBehavior {
    /**
     * 飞翔
     */
    void fly();
}
