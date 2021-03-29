package com.hl.magic.dpattern.dp3singleton.demo02;

/**
 * 【特例】
 * 通用的单例程序
 */
@SuppressWarnings("all")
public class SingletonPattern01 {

    private static SingletonPattern01 singletonPattern = null;

    //private限制不能直接产生一个实例
    private SingletonPattern01(){

    }

    public SingletonPattern01 getInstance(){
        //如果还没有实例，则创建一个
        if (this.singletonPattern == null) {
            this.singletonPattern = new SingletonPattern01();
        }
        return this.singletonPattern;
    }
}
