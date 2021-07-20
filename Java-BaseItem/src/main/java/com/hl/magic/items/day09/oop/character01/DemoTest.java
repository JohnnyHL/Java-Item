package com.hl.magic.items.day09.oop.character01;

import org.junit.Test;

/**
 * 封装特性的简单测试
 *
 * 不安全
 * @author hl
 */
public class DemoTest {

    @Test
    public void test_Case(){
        //new一个杰克
        Man man = new Man();
        man.name = "杰克";
        man.money = 1000;

        //new一个露西
        Woman woman = new Woman();
        woman.name = "露西";

        //杰克迎娶露西
        man.marry(woman);

        //一天，来了一个小偷
        Thief thief = new Thief();
        thief.stealMoney(man);
        thief.stealWoman(man);
        System.out.println(man.name + "的妻子：" + man.wife.name);
        System.out.println(man.name + "的钱包：$" + man.money);

        System.out.println("……………………出现上述情况，是可忍孰不可忍，封装特性要出场了");
    }
}
