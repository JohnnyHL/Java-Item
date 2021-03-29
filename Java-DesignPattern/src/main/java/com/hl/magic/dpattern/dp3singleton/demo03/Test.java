package com.hl.magic.dpattern.dp3singleton.demo03;

public class Test {

    public static void main(String[] args) {
        //1.饿汉式单例
        SingletonPattern1.doSomething();

        //2.懒汉式单例
        SingletonPattern2 singletonPattern2 = SingletonPattern2.getInstance();
        singletonPattern2.doSomething();
    }
}
