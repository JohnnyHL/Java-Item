package com.hl.magic.base.multithreaded.demo01;

/**
 * 修改线程名称
 *
 * @author hl
 * @date 2019/9/9
 */
public class SubThread02 extends Thread{

    /**
     * 构造方法修改线程名称
     */
    public SubThread02(){
        super("小强");
    }

    /**
     * 重写Thread线程类的run方法
     */
    @Override
    public void run() {
        System.out.println("====>子线程名称：" + getName());
    }
}
