package com.hl.magic.items.day14.multithreaded.demo02;

/**
 * @author hl
 * @date 2019/9/16
 */
public class SubRunnable implements Runnable {

    @Override
    public void run() {
        int len = 50;
        for (int i = 0; i < len; i++) {
            System.out.println("run... ..." + i);
        }
    }
}
