package com.hl.magic.items.day01.basecode.objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Java中创建对象的五种方式
 *
 * @author hl
 */
public class CreateObject {

    /**
     * 【1】使用new关键字
     * 构造方法初始化对象
     */
    public static void fun1() {

        Person01 person = new Person01();
        person.setName("Jack");
        person.setAge(17);

        System.out.println("====>[1]new关键字创建对象");
        System.out.println("姓名：" + person.getName());
        System.out.println("年龄：" + person.getAge());
    }

    /**
     * 【2】使用class类的newInstance方法
     * 反射原理
     */
    public static void fun2() {
        try {
            Person01 person = Person01.class.newInstance();
            person.setName("Rose");
            person.setAge(18);
            System.out.println("====>[2]class类的newInstance方法创建对象");
            System.out.println("姓名：" + person.getName());
            System.out.println("年龄：" + person.getAge());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    /**
     * 【3】Constructor类的newInstance方法
     * 反射原理
     */
    public static void fun3() {
        try {
            Constructor<Person01> constructor = Person01.class.getConstructor();
            Person01 person = constructor.newInstance();
            person.setName("Johnny");
            person.setAge(19);

            System.out.println("====>[3]Constructor类的newInstance方法创建对象");
            System.out.println("姓名：" + person.getName());
            System.out.println("年龄：" + person.getAge());

        } catch (NoSuchMethodException
                | IllegalAccessException
                | InstantiationException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * [4]使用clone方法创建对象
     */
    public static void fun4() {
        try {
            //new一个Person对象出来
            Person01 person = new Person01();

            //克隆一个Person对象出来
            Person01 clone = person.clone();

            clone.setName("克隆羊");
            clone.setAge(16);
            System.out.println("====>[4]使用clone方法创建对象");
            System.out.println("姓名：" + clone.getName());
            System.out.println("年龄：" + clone.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * [5]使用反序列化创建对象
     * 当序列化和反序列化一个对象时，JVM会创建一个单独的对象。
     * 在反序列化时，JVM创建对象并不会调用任何构造函数，
     * 为了反序列化一个对象，需要让我们的POJO类实现Serializable接口
     */
    public static void fun5() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("E://Study//Test//data.obj"));
            Person01 person = (Person01) inputStream.readObject();

            person.setName("反序列化");
            person.setAge(20);
            System.out.println("====>[5]使用反序列化创建对象");
            System.out.println("姓名：" + person.getName());
            System.out.println("年龄：" + person.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fun1();
        fun2();
        fun3();
        fun4();
        fun5();
    }
}
