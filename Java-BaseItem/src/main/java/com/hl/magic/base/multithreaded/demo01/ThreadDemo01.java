package com.hl.magic.base.multithreaded.demo01;

/**
 * 线程随机性
 * 线程调度的两种方式：分时调度模式、抢占(优先级)模式
 *
 * 创建线程的一种方式：
 *      1.将类声明为Thread的子类,该子类应重写Thread类的run方法。
 *      2.接下创建该子类的实例，并通过实例对象来调用start方法启动线程。
 *
 * 线程必然就是Thread类对象
 *  static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 *
 *  修改线程名：
 *  void setName(String name)   改变线程名称，使之与参数 name 相同。
 *  通过构造方法修改县城名
 *  Thread(String name)        分配新的 Thread 对象。
 *
 *
 * @author hl
 * @date 2019/9/9
 */
public class ThreadDemo01 {

    /**
     * 线程
     */
    public static void fun1(){
        SubThread01 subThread = new SubThread01();
        //修改线程名称
        subThread.setName("子类线程");
        subThread.start();
        //线程对象
        Thread thread = Thread.currentThread();
        System.out.println("=====>当前线程：" + thread.getName());

        int len = 5;
        for (int i = 0; i < len; i++) {
            System.out.println("main... ..." + i);
        }
    }
    /**
     * 线程休眠
     * Thread类的sleep方法
     * static void sleep(long millis)
     * 在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
     */
    public static void fun2(){
        new SleepThread().start();
    }

    /**
     * 修改线程名称
     * 方式1：通过构造方法来修改线程名
     * 方式2：在执行start方法前，如果执行setName(),则改变线程名称，使之与参数 name 相同。
     */
    public static void fun3(){
        SubThread02 st02 = new SubThread02();
        st02.setName("demo02");
        st02.start();

        Thread thread = Thread.currentThread();
        System.out.println("====>主线程名称：" +thread.getName());
    }


    public static void main(String[] args) {
        fun1();
        fun2();
        fun3();
    }
}
