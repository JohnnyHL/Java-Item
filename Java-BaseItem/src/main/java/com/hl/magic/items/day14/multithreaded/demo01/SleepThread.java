package com.hl.magic.items.day14.multithreaded.demo01;

/**
 * Thread类的sleep方法
 *
 * @author hl
 * @date 2019/9/16
 */
public class SleepThread extends Thread{

    /**
     *
     */
    @Override
    public void run() {
        int len = 5;
        for (int i = 0; i < len; i++) {
            try {
                //线程休眠
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run... ..." + i);
        }
    }
}
