package com.hl.magic.base.multithreaded.demo02;

/**
 * 实现线程的方式：【2】实现Runnable接口
 * 1.声明实现Runnable接口的类，并重写接口中的抽象方法run()。
 * 2.然后分配该类的实例，在创建Thread时作为一个参数来传递并调用Thread类的start方法来启动。
 *
 * @author hl
 * @date 2019/9/16
 */
public class ThreadDemo02 {

    public static void fun1() {
        //创建并启动一个线程
        SubRunnable runnable = new SubRunnable();
        new Thread(runnable).start();
    }

    public static void main(String[] args) {
        fun1();
    }
}
