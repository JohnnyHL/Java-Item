package com.hl.magic.base.multithreaded.demo01;

/**
 * Java多线程实现方式：【1】继承Thread类，重写父类的run方法
 *
 * @author hl
 * @date 2019/9/9
 */
public class SubThread01 extends Thread {

    /**
     * 重写Thread线程类的run方法
     */
    @Override
    public void run() {
        int len = 5;
        System.out.println("====>子类线程：" + getName());
        for (int i = 0; i < len; i++) {
            System.out.println("run... ..." + i);
        }
    }
}
