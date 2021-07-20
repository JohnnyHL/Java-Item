package com.hl.magic.items.day20.reflection;


/**
 * Java反射机制
 * [1]类加载器
 * 当程序要使用某个类的时候，如果该类还未加载到内存中，则系统会通过加载、连接、初始化三步来实现这个类的初始化。
 *
 * @author hl
 * @date 2020/1/8
 */
public class ReflectiveDemo01 {


    private String userName;

    public ReflectiveDemo01() {
        this.userName = "小明";

        String path = this.getClass().getClassLoader().getResource("").getPath();
        System.out.println("path======>  " + path);

        String path1 = ReflectiveDemo01.class.getClassLoader().getResource("").getPath();
        System.out.println("path1=====>  " + path1);

    }

    public String getUserName() {
        return userName;
    }

    public static void main(String[] args) {
        new ReflectiveDemo01();

        Class<ReflectiveDemo01> reflectiveDemo01Class = ReflectiveDemo01.class;

        String name = reflectiveDemo01Class.getName();
        System.out.println("name======>  " + name);
    }
}