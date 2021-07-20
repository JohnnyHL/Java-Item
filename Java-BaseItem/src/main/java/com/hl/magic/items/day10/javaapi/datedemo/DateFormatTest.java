package com.hl.magic.items.day10.javaapi.datedemo;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 对日期进行格式化(自定义)
 *【1】DateFormat类
 *	java.text.DateFormat
 *	日期/时间格式化子类的抽象类，不能new对象
 *	实际使用java.text.SimpleDateFormat 可以使用父
 *	类普通方法，重写了抽象方法
 *
 *【2】子类
 *	SimpleDateFormat子类创建对象
 *
 *构造方法：
 *	SimpleDateFormat(String pattern);	用给定的模式和默认的语言环境的日期格式符号构造SimpleDateFormat
 *
 *DateFormat类方法
 *	String format(Date date);	将一个Date格式化为日期/时间字符串
 *
 *DateFormat类作用：
 *	将一个Date对象转换为符合指定格式的字符串，也可以将一个符合指定格式的字符串转换为Date对象。
 *
 *【3】DateFormat类方法	parse
 *	将字符串解析为日期对象
 *Date parse(String s);将字符串变成日期对象
 *String==>Date 用 parse()
 *Date====>String 用 format()
 *
 *【注意】
 *	时间和日期的模式"yyy-MM-dd HH：mm:ss"。必须和字符串中的时间和日期匹配
 *			   "2018-7-31 11:31:20"
 *
 *	日期控件，用户选择的形式输入
 *
 * @author hl
 */
public class DateFormatTest {

    /**
     * 日期格式化
     * 	1.创建SimpleDateFormat对象
     * 		在类构造方法中，写入字符串的日期格式(自定义)
     * 	2.SimpleDateFormat调用方法format对日期进行格式化
     * 		String format(Date date);传递日期对象，返回字符串
     * 日期模式：
     * 		yyyy	年份
     * 		MM		月份
     * 		dd		月中的天数
     * 		HH		0-23小时
     * 		mm		小时中的分钟数
     * 		ss		秒
     *
     */
    @Test
    public void function_01(){
        //填入日期格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调用匿名对象,返回字符串类型
        String date01 = dateFormat.format(new Date());
        System.out.println(date01);
    }

    /**
     * DateFormat类方法 parse
     * 1.创建SimpleDateFormat子类对象
     * 	构造方法中，指定日期格式
     * 2.子类对象，调用方法parse,传递String,返回false
     */
    @Test
    public void function_02() throws Exception{
        String str1 = "2018-7-31 11:31:20";
        //指定日期格式
        SimpleDateFormat dateFormat02 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调parse方法
        Date time1 = dateFormat02.parse(str1);
        System.out.println(time1);
    }
}
