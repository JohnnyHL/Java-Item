package com.hl.magic.dpattern.dp3singleton.demo02;

/**
 *
 */
@SuppressWarnings("all")
public class SingletonPattern02 {

    private static final SingletonPattern02 singletonPattern02 =
            new SingletonPattern02();

    /**
     * 限制住不能直接产生一个实例
     */
    private SingletonPattern02(){

    }

    /**
     * 直接new一个对象传递给类的成员变量singletonPattern02
     * 当需要的时候，直接getInstance()返singletonPattern02给你即可。
     * @return
     */
    public synchronized static SingletonPattern02 getInstance(){
        return singletonPattern02;
    }
}
