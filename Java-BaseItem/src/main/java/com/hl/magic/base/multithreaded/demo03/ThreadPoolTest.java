package com.hl.magic.base.multithreaded.demo03;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * 使用线程池方式：【3】使用ExecutorService、Callable、Funture实现有返回结果的多线程
 *
 * 线程池通过线程工厂创建，调用线程池中的方法获取线程，再通过线程去执行任务方法。
 * 使用工厂类Executors中的静态方法创建线程对象，指定线程的个数；
 * static ExecutorService newFixedThreadPool(int num);返回线程池对象
 * 返回接口的实现类(线程池对象)
 * 接口实现类的对象调用submit方法(Runnable r)，提交线程执行任务
 *
 * @author hl
 * @date 2019/9/17
 */
public class ThreadPoolTest {

    /**
     * 同步线程池
     */
    private static final ExecutorService SYNC_POOL = new ScheduledThreadPoolExecutor(100);

    @Test
    public void fun1() {
        //调用工厂的静态方法，创建线程池对象
        //返回线程池对象，返回对象的接口
        int len = 5;
        ExecutorService es = newFixedThreadPool(len);
        //接口实现类的对象调用submit方法(Runnable r)，提交线程执行任务
        //将Runnable接口的对象作为参数传递即可
        for (int i = 0; i < len; i++) {
            es.submit(new SubRunnable04());
        }
        //销毁当前线程池
        es.shutdown();
    }

    @Test
    public void fun2(){
        SYNC_POOL.execute(new Runnable() {
            @Override
            public void run() {
                new SubRunnable04();
            }
        });
    }


}
