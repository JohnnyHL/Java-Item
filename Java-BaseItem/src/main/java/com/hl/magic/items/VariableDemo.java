package com.hl.magic.items;

/**
 * 类变量和成员变量
 *
 * @Author HL
 * @Date 2021/8/13 11:43
 */
public class VariableDemo {

    /**
     * 类变量
     */
    private static int anInt = 1;

    private final static int AN_INT = 1;

    /**
     * 成员变量
     */
    private int bnInt = 2;
    private final int BN_INT = 1;

    public void run2(){
        System.out.println("没有static修饰的普通方法");
    }

    public static void run1(){
        anInt = 2;
        System.out.println("static修饰的静态方法");
    }

    public static void main(String[] args) {
        //静态方法只能调用静态
        run1();
    }

}
