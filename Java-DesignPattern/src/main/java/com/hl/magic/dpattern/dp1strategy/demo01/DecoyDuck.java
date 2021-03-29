package com.hl.magic.dpattern.dp1strategy.demo01;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck1;

/**
 * 又增加了一个子类鸭子
 *
 * @author hl
 */
public class DecoyDuck extends BaseDuck1 {
    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }

    @Override
    public void quack() {
        //不会叫
    }
}
