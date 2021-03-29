package com.hl.magic.dpattern.dp1strategy.base;

/**
 * 策略模式--demo02
 * 需求：让鸭子起飞
 * 分析：只要在父类鸭子中实现一个fly的方法，所有子类鸭子就成功的会飞了
 * 步骤：Duck增加fly方法。
 *
 * 定义一个抽象鸭子类，作为所有鸭子的父类，将部分的方法剥离出来作为接口
 * 以后有需要次方法的子类将自行实现
 *
 * 问题：使用接口后确实不用写这么多空实现了，但是也暴露了另外一个问题
 *      会出现重复的代码，如果N多只鸭子都会同样的起飞动作，那么每只鸭子都要去实现同样的fly方法
 *      此时，使用接口实现不太友好。
 * 分析：在demo03中，我们将再次增加功能需求，定制功能的实体
 *
 * @author hl
 */
public abstract class BaseDuck2 {

    public BaseDuck2() {
    }

    /**
     * 鸭子外观
     */
    public abstract void display();

    public void quack(){
        System.out.println("叫声：呱呱叫");
    }

    public void swim(){
        System.out.println("下水：游泳");
    }

    /**
     * 根据需求，给鸭子新增一个会飞的功能
     */
    public void fly(){
        System.out.println("上天：飞起来");
    }
}
