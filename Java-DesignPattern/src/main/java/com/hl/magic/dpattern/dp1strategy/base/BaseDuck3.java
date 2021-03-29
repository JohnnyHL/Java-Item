package com.hl.magic.dpattern.dp1strategy.base;

/**
 * 策略模式--demo03
 *
 * 需求：  1-增加橡皮鸭、诱饵鸭；
 *        2-橡皮鸭会吱吱叫，不会飞；
 *        3-诱饵鸭不会叫也不会飞
 *
 * 分析：父类定义的某些方法实现，这时候子类不需要了，直接覆盖掉就可以。
 * 步骤：1-继承父类增加两只鸭子
 *      2-覆盖需要重新实现的方法。
 *
 * 问题：随着需求的不断增加，当采用继承的方式设计代码不够用了。
 *      以后所有的鸭子都默认有父类的方法，
 *      如果不需要这些方法，就得每次提供空实现，
 *      如果忘记提供，那么就会多出不需要的方法了。
 *
 * 解决：在demo04中，我们将再次增加功能需求，定制功能的实体
 *
 * @author hl
 */
public abstract class BaseDuck3 {

    public BaseDuck3() {
    }

    public abstract void display();

    public void quack(){
        System.out.println("呱呱叫");
    }

    public void swim(){
        System.out.println("游泳");
    }

    public void fly(){
        System.out.println("飞起来");
    }
}
