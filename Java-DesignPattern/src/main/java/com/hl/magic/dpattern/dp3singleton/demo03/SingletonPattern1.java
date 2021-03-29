package com.hl.magic.dpattern.dp3singleton.demo03;

/**
 *	【1】线程不安全的单例---------饿汉式单例
 *	问题：高并发情况下，单例的线程同步问题
 */
public class SingletonPattern1 {

    private static SingletonPattern1 singletonPattern = new SingletonPattern1();

    //限制产生对个对象
    private SingletonPattern1() {

    }
    //通过该私有化方法获取实例对象
    private static SingletonPattern1 getInstance(){
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern1();
        }
        return singletonPattern;
    }

    public static void doSomething() {
        System.out.println("单例模式：饿汉式单例，在高并发情况下，单例线程不安全。");
    }
}