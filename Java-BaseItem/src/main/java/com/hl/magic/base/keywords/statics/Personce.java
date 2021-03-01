package com.hl.magic.base.keywords.statics;

/**
 *	static关键字
 *	静态修饰符，一般用来修饰类中的成员变量，做全局处理用。
 *
 *【1】static特点
 *	被static修饰的变量，属于类(类变量),不属于这个类的特有对象，而是属于数据的共享内容。
 *	实现对象的共享数据，在数据前加static修饰，这个对象将作为数据的共享存在。
 *	定义对象的特有数据（非静态修饰内容），调用者只能是对象；
 *	定义对象的共享数据（静态修饰内容），调用者可以使new的对象，也可以是类名；
 *
 *【2】被static修饰的成员变量，可以被类名直接调用。
 *	访问静态成员的格式：类名.静态成员变量名
 *
 *【3】被static修饰的方法，可以被类名直接调用
 *	访问静态方法的格式：类名.方法
 *
 * @author hl
 * @date 2020/4/3 19:29
 */
public class Personce {

    static int ID = 10;
    String name;
    static String className;

    public static void run() {
        System.out.println("Person类中的静态run方法------>奔跑吧...");
    }
}