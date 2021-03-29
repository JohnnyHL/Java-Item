package com.hl.magic.dpattern.dp1strategy.base;

import com.hl.magic.dpattern.dp1strategy.demo05.entity.MuteQuack;
import com.hl.magic.dpattern.dp1strategy.demo05.entity.RedDuck;
import com.hl.magic.dpattern.dp1strategy.demo05.service.IFlyBehavior;
import com.hl.magic.dpattern.dp1strategy.demo05.service.IQuackBehavior;

/**
 * 策略模式--demo05
 * 进一步优化，使用组合方式定义鸭子
 *
 * 需求：拓展的时候要解决重复代码和动态实现方法的问题
 *
 * 分析：继承会使方法不太灵活，接口和会导致重复代码。使用组合方式，面向接口编程
 * 步骤：
 *      1.封装鸭子的行为(动态的方法)，定义行为接口(叫、飞)
 *      2.定义子类去实现行为接口(面向接口)
 *      3.在父类鸭子中组合这些行为(多态方式，将鸭子的行为实例化)，而子类则提供具体的行为实现
 *
 * 行为接口：
 *      1.FlyBehavior接口、以及它的不同实现方式：飞、不会飞
 *      2.QuackBehavior接口、以及它的不同实现方式：吱吱叫、呱呱叫、不会叫
 *
 * 实体鸭子：实现鸭子组合行为，子类实例化具体行为
 *
 * 问题：组合的拓展性很强大，代码重构以后，不用担心拓展任何功能的鸭子
 *      如果没有功能，我们就可以提供鸭子行为接口，并提供实现类，组合到新的鸭子里面即可。
 *      但是，这样不够多态，如果我们要连行为都是动态的呢？
 *
 * 解决：在demo06中，我们将对之前的代码进行再次升级，增加需求的同时也能够轻松拓展。
 *
 * @author hl
 */
public abstract class BaseDuck5 {
    /**
     *鸭子飞翔接口实例
     */
    public IFlyBehavior flyBehavior;
    /**
     *鸭子鸣叫接口实例
     */
    public IQuackBehavior quackBehavior;

    /**
     * 固有属性：鸭子游泳
     */
    public void swim(){
        System.out.println("下水游泳");
    }

    /**
     * 固有属性：鸭子毛色
     */
    public abstract void display();

    /**
     * 调用鸭子叫的接口
     * 至于鸭子怎么叫，我们暂且不管
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     *调用鸭子飞的接口
     * 至于鸭子怎么飞，我们暂且不管
     */
    public void performFly(){
        flyBehavior.fly();
    }
    public static void main(String[] args){
        /**
         * 多态，实例化duck
         */
        MuteQuack muteQuack = new MuteQuack();
        System.out.println("===========沉默鸭===========");
        muteQuack.quack();

        System.out.println("===========红头鸭===========");
        RedDuck redDuck = new RedDuck();
        redDuck.performFly();
        redDuck.performQuack();
    }
}
