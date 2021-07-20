package com.hl.magic.items.day06.customs;

/**
 * 方法,调用中的参数传递问题
 * 1. 方法参数是基本数据类型
 * 2. 方法参数是引用类型
 * 传递的是内存地址!!!
 *
 * @author HL
 * @date 2021/3/23 21:51
 */
public class MethodDemo_3 {

    public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		change(a,b);
//		System.out.println(a);
//		System.out.println(b);

        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }

    public static void change(int[] arr) {
        arr[2] = 100;
    }


    public static void change(int a, int b) {
        a = a + b;
        b = b + a;
    }

}
