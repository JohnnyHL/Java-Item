package com.hl.magic.dpattern.dp1strategy.demo07;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * 策略模式：属于对象的行为模式。
 * 其用意是针对一组算法，将每个算法封装到具有共同接口的独立的类中，从而使得它们可以相互转换。
 * 策略模式使得算法可以在不影响客户端的情况下发生变化。
 *
 * 策略模式是对算法的包装，是把使用算法的责任和算法本身分割开来，为拍给不同的对象管理。
 */
public class DemoTest01 {
    @Test
    public void run1(){
        /**
         * 定义5个策略，每个策略实现一个算法
         */
        Consumer<String> strategy1 = o ->System.out.println("算法1：" + o);
        Consumer<String> strategy2 = o ->System.out.println("算法2：" + o);
        Consumer<String> strategy3 = o ->System.out.println("算法3：" + o);
        Consumer<String> strategy4 = o ->System.out.println("算法4：" + o);
        Consumer<String> strategy5 = o ->System.out.println("算法5：" + o);

        /**
         * 执行算法
         */
        strategy1.accept("参数1");
        strategy2.accept("参数2");
        strategy3.accept("参数3");
        strategy4.accept("参数4");
        strategy5.accept("参数5");
    }
}
