package com.hl.magic.base.oop.character02;

import org.junit.Test;

/**
 * 封装特性测试
 *
 * 特殊用法：
 *  this可以用于调用本类构造函数，格式是this(参数列表),
 *  而且必须放在构造函数的第一行，所以this和super是不能共存的。
 *
 *
 * 总结：
 *      面向对象的封装，封装不仅仅是private+getter and setter方法。
 *      使用封装可以对setter进行深层次的定制；
 *      你可以对可以执行setter方法的对象做规定，也可以对数据作要求，还可以做类型转换等等一系列你可以想到的
 *
 *      使用封装不仅仅是安全，更可以模块化操作，
 *
 * @author Administrator
 */
public class DemoTest {

    @Test
    public void test_Case1(){

        PackageMan man = new PackageMan("杰克", 1000);
        PackageMan man1 = new PackageMan("汤姆",5);

        man.setMoney(man,2000);
        System.out.println(man.getName() + "的钱：" + man.getMoney());
        man.setMoney(man1,100);
    }

    @Test
    public void test_Case2(){
        PackageMan man = new PackageMan("杰克", 1000);

        PackageWoman woman = new PackageWoman("露西");
        man.marry(woman);
        System.out.println(man.getName() + "的妻子：" + man.getWife().getName());
        System.out.println(man.getName() + "的钱：" + man.getMoney());
    }
}
