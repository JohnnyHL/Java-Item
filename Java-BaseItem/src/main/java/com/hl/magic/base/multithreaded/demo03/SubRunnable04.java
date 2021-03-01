package com.hl.magic.base.multithreaded.demo03;

/**
 * @author hl
 */
public class SubRunnable04 implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "...线程提交的任务...");
    }
}
