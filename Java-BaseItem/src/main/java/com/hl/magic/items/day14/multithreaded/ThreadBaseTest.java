package com.hl.magic.items.day14.multithreaded;

/**
 * 线程测试
 * java.lang.Thread.
 * 线程类实现了Runnable接口
 * public class Thread extends Object implements Runnable
 *
 *
 * @author hl
 * @date 2020/6/19 9:58
 */
public class ThreadBaseTest extends Thread{

    public static void update(){
        long nanoTime = System.nanoTime();
        try {
            Thread.sleep(nanoTime + 1);
            System.out.println("=========================>");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        update();
    }
}
