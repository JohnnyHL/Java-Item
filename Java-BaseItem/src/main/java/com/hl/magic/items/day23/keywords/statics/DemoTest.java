package com.hl.magic.items.day23.keywords.statics;

/**
 * @author hl
 * @date 2020/4/3 19:30
 */
public class DemoTest {

    public static void main(String[] args) {

        Personce p1 = new Personce();
        Personce p2 = new Personce();

        p1.name = "小明";
        p2.name = "小红";

        System.out.println(p1.name);
        System.out.println(p2.name);

        //对象调用类的静态成员变量
        Personce.className = "基础班";
        System.out.println(Personce.className);

        //被static修饰的成员变量，可以被类名直接调用
        System.out.println(Personce.className);
    }
}
