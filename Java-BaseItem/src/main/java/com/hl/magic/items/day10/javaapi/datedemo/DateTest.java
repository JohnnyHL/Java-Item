package com.hl.magic.items.day10.javaapi.datedemo;

import org.junit.Test;

import java.util.Date;

/***
 * @author Administrator
 *	时间和日期类
 *	java.util.Date;
 *
 *【1】毫秒
 *	毫秒的0点(时间原点，公元1970年1月1日，0点)
 *		System.currentTimeMillis(); 返回值long类型参数
 *		含义：获取当前日期的毫秒值
 *	日期不能进行加/减/乘/除运算，毫秒值为long类型，可以进行计算
 */
public class DateTest {

    /**
     * Date类currentTimeMaills()方法
     * 获取当前日期的毫秒值
     */
    @Test
    public void function_0(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    /**
     * Date类的空参数构造方法
     * 获取到的是当前操作系统中的时间和日期
     */
    @Test
    public void function_1(){
        //需导util的jar包
        Date date01 = new Date();
        System.out.println(date01);
    }

    /**
     * Date类的long参数构造方法
     * 分配 Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
     * Date(long date)，表示毫秒值,它传递毫秒值后，将毫秒值转成对应的日期对象.
     */
    @Test
    public void function_2(){
        Date date02 = new Date(0);
        System.out.println(date02);
    }

    /**
     * Date类方法getTime()，返回值long类型
     *
     * 将Date表示的日期转换为对应的时间毫秒值
     * 日期==========>毫秒值
     * 返回值：毫秒数
     */
    @Test
    public void function_3(){
        Date date03 = new Date();
        //返回值是long类型的参数,获取毫秒值
        long time = date03.getTime();
        System.out.println(time);
    }

    /**
     * Date类的setTime(long date);传递毫秒值
     *
     * 将日期对象，设置到指定的毫秒值上
     * 毫秒值==========>日期对象
     */
    @Test
    public void function_4(){
        Date date04 = new Date();
        //获取日期格式的字符串
        date04.setTime(0);
        System.out.println(date04);
    }

}