package com.hl.magic.items.day20.reflection;


import org.junit.Test;

/**
 * Java反射机制
 * [1]类加载器
 * 当程序要使用某个类的时候，如果该类还未加载到内存中，则系统会通过加载、连接、初始化三步来实现这个类的初始化。
 * <p>
 * 获取class的三种方式
 *
 * @author hl
 * @date 2020/1/8
 */
public class ReflectiveDemo02 {


    /**
     * 获取class的三种方式
     */
    @Test
    public void test_OK() {
        try {
            //1-Class.forName("全类名")
            Class<?> c1 = Class.forName("com.hl.magic.items.day20.reflection.ReflectiveDemo02");
            System.out.println(c1);

            //2-类名.lcass
            Class c2 = ReflectiveDemo02.class;
            System.out.println(c2);

            //3-对象.getClass()
            ReflectiveDemo02 reflectiveDemo02 = new ReflectiveDemo02();
            Class c3 = reflectiveDemo02.getClass();
            System.out.println(c3);

            String path = reflectiveDemo02.getClass().getClassLoader().getResource("").getPath();
            System.out.println(path);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}