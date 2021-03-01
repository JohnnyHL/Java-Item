package com.hl.magic.base.multithreaded.demo03;

import org.junit.Test;

/**
 * 匿名内部类
 * 使用线程匿名内部类的方式，实现每个线程的不同线程任务操作。
 *
 * @author hl
 * @date 2019/9/17
 */
public class ThreadDemo03 {

    @Test
    public void fun1() {
        /**
         * 方式1：创建线程时，直接重写Thread线程类的run方法
         */
        new Thread() {
            @Override
            public void run() {
                System.out.println("====>匿名内部###:" + Thread.currentThread().getName());
            }
        }.start();

        /**
         * 方式2：使用匿名内部类的方式实现Runnable接口，并重写接口的run方法
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("====>实现接口方式:" + Thread.currentThread().getName());
                System.out.println("========>线程状态：" + Thread.currentThread().isAlive());
                System.out.println("========>线程状态：" + Thread.currentThread().isDaemon());
                System.out.println("========>线程状态：" + Thread.currentThread().isInterrupted());
            }
        };
        new Thread(runnable).start();

        /**
         * 方式3：合并实现方式
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("====>合并实现的方式:" + Thread.currentThread().getName());
            }
        }).start();
    }
}