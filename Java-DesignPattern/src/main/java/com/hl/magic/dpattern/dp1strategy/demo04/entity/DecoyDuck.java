package com.hl.magic.dpattern.dp1strategy.demo04.entity;

import com.hl.magic.dpattern.dp1strategy.base.BaseDuck4;

/**
 * 诱饵鸭
 * 继承父类的外观
 *
 * @author hl
 */
public class DecoyDuck extends BaseDuck4 {
    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }
}
