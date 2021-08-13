package com.hl.magic.items.day07.autoboxing;

import org.junit.Test;

/**
 * 自动装箱与拆箱
 *
 * @Author HL
 * @Date 2021/8/12 14:27
 */
public class AutoBoxingDemo {

    /**
     * 自动装箱：将基本数据类中用它们对应的引用类型包装起来
     */
    @Test
    public void run1() {
        int a = 12;
        Integer integer = Integer.valueOf(a);
        System.out.println("===>自动装箱：" + integer);
    }

    /**
     * 自动拆箱：将包装类型转换为基本数据类型
     */
    @Test
    public void run2() {
        Integer integer = 111111111;

        int value = integer.intValue();
        System.out.println("===>自动拆箱：" + value);
    }
}
