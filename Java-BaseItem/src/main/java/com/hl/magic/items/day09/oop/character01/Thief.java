package com.hl.magic.items.day09.oop.character01;

import java.util.ArrayList;
import java.util.List;

/**
 * 小偷类
 * @author hl
 */
public class Thief {

    private double stealMoney = 0;

    private List<Woman> stealWoman = new ArrayList<>();

    /**
     * 偷钱
     */
    public void stealMoney(Man man){
        //小偷偷钱
        stealMoney = stealMoney +  man.money;
        //小偷偷完后，丈夫的钱包空了
        man.money = 0;
        System.out.println("来了一个小偷，他偷到钱了");
    }

    /**
     * 最是可恨，不仅偷钱，还把露西偷走，顺便把凤姐丢给你了
     */
    public void stealWoman(Man man){
        stealWoman.add(man.wife);
        Woman woman = new Woman();
        woman.name = "凤姐";
        man.wife = woman;
        System.out.println("他偷完钱后，又偷走了露西，顺便放下一个凤姐");
    }

}
