package com.hl.magic.dpattern.dp1strategy.base;

import com.hl.magic.dpattern.dp1strategy.demo06.entity.ModelDuck;
import com.hl.magic.dpattern.dp1strategy.demo06.service.IFlyBehavior;
import com.hl.magic.dpattern.dp1strategy.demo06.service.IQuackBehavior;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.FlyRocketPowered;
import com.hl.magic.dpattern.dp1strategy.demo06.service.impl.Squeak;

/**
 * 策略模式--demo06
 * 增加需求--进一步的拓展，让鸭子那个连行为都是动态的
 * 组合行为(算法族)到鸭子上实现动态可以动态改变行为(算法)，这就是策略模式
 * <p>
 * 需求：增加一个模型鸭，不会飞，会呱呱叫。但是模型鸭可以变成吱吱叫，并且能够用火箭起飞
 * 分析：由于我们将鸭子的行为当成属性组合到父类中，要改变行为，只需提供改变属性的set方法即可
 * 步骤：1.修改Duck类，增加改变属性的flyBehavior、quackBehavior的方法
 * 2.拓展模型鸭提供默认行为实现
 * 3.增加fly的实现方式用火箭飞
 * 归纳：从最初的继承、到接口、到封装方式改变，面向接口编程。体会到设计的美妙之处。
 * 这样写出来的代码具有较高的拓展性，重复度较低，无论是拓展行为，还是拓展实体，都可以驾驭。
 * 但是如果一开始就没有思考和设计，随意设计，一旦项目代码和业务增多，那么重构的成本将会提高很多。
 * <p>
 * 本系列demo实际上就是策略模式的逐渐演变过程，我们把鸭子的行为(算法族)封装起来，给行为具体实现(算法)。
 * 总结一下学习策略模式的一些设计原则：
 * 1.将变化的部分和固定的部分区别开来，封装变化
 * 2.面向接口编程，而不是面向实现编程
 * 3.组合比继承好用，多用组合，少用继承。
 *
 * @author hl
 */
public abstract class BaseDuck6 {
    /**
     * 鸭子飞和叫的接口实例化
     * 赋予鸭子起飞和叫的功能
     */
    public IFlyBehavior flyBehavior;
    public IQuackBehavior quackBehavior;

    /**
     * 固有属性：鸭子游泳
     */
    public void swim() {
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
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 调用鸭子飞的接口
     * 至于鸭子怎么飞，我们暂且不管
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 修改鸭子飞翔行为
     *
     * @param flyBehavior
     * @return
     */
    public BaseDuck6 setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
        return this;
    }

    /**
     * 修改鸭子的行为
     *
     * @param quackBehavior
     * @return
     */
    public BaseDuck6 setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
        return this;
    }

    public static void main(String[] args){
        /**
         * 多态，实例化鸭子
         */
        BaseDuck6 modelDuck = new ModelDuck();
        /**
         * 调用叫和飞接口
         */
        modelDuck.performQuack();
        modelDuck.performFly();
        /**
         * 实例化叫的方式，让鸭子拥有呱呱叫的方式
         */
        Squeak squeak = new Squeak();
        modelDuck.setQuackBehavior(squeak);
        /**
         * 实例化飞的方式，让鸭子拥有火箭起飞方式
         */
        FlyRocketPowered rocket = new FlyRocketPowered();
        modelDuck.setFlyBehavior(rocket);
    }
}
