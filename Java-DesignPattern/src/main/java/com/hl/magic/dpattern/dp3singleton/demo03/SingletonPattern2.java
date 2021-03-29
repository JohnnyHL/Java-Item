package com.hl.magic.dpattern.dp3singleton.demo03;

/**
 *	【2】通用单例模式-----------懒汉式单例
 *	直接new一个对象传递给类的成员变量singletonPattern2,
 *	在你需要的时候getTnstance()直接返回给你！
 */
public class SingletonPattern2 {

    //直接new一个对象传递给类的成员变量singletonPattern2,在你需要的时候getTnstance()直接返回给你！
    private static final SingletonPattern2 singletonPattern2 =
            new	SingletonPattern2();

    //限制不能直接产生一个实例
    private SingletonPattern2(){

    }
    public synchronized static SingletonPattern2 getInstance() {
        return singletonPattern2;	//在你需要的时候getTnstance()直接返回给你！
    }

    public static void doSomething(){
        System.out.println("单例模式：懒汉式单例，当你需要这个类对象的时候，就new一个对象传递给你");
    }
}
