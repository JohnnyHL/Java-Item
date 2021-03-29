package com.hl.magic.dpattern.dp1strategy.base;

/**
 * 策略模式--demo01
 * 定义一个抽象鸭子类，作为所有鸭子的父类
 * 将来鸭子数量增多时，直接多写鸭子类。
 *
 * 需求：鸭子数量增加
 * 分析：鸭子数量增加，直接定义对应的鸭子类
 * 步骤：增加鸭子类定义。
 *
 * 问题：定义多个鸭子类，都去集成鸭子父类，也继承了鸭子的行为属性
 *      此时直接在父类中定义特定功能，则所有鸭子都具有该功能。
 *
 * 分析：在demo02中，我们将再次增加功能需求，定制功能的实体
 *
 * @author hl
 */
public abstract class BaseDuck1 {

    public BaseDuck1() {
    }

    /**
     * 鸭子外观
     */
    public abstract void display();

    public void quack() {
        System.out.println("呱呱叫");
    }

    public void swim() {
        System.out.println("游泳");
    }
}
