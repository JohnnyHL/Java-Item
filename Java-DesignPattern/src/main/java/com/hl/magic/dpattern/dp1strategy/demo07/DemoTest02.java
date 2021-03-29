package com.hl.magic.dpattern.dp1strategy.demo07;

import org.junit.Test;

import java.util.function.Consumer;

public class DemoTest02 {
    @Test
    public void run1() {
        /**
         * 定义5个策略，每个策略实现一个算法
         */
        strategy(t -> System.out.println("算法：" + t + "：参数" + t),"1");
        strategy(t -> System.out.println("算法：" + t + "：参数" + t),"2");
        strategy(t -> System.out.println("算法：" + t + "：参数" + t),"3");
        strategy(t -> System.out.println("算法：" + t + "：参数" + t),"4");
        strategy(t -> System.out.println("算法：" + t + "：参数" + t),"5");
    }
    public <T> void strategy(Consumer<T> consumer,T t){
        consumer.accept(t);
    }
}
