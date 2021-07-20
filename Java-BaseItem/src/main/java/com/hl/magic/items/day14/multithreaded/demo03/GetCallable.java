package com.hl.magic.items.day14.multithreaded.demo03;

import java.util.concurrent.Callable;

/**
 * @author hl
 * @date 2019/9/17
 */
public class GetCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {

        return 123;
    }
}
