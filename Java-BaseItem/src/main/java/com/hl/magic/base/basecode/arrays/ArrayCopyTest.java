package com.hl.magic.base.basecode.arrays;

import java.util.Arrays;

/**
 * 数组拷贝
 * @author Administrator
 */
public class ArrayCopyTest {

    public static void testCopy(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] ints = Arrays.copyOf(arr, 3);
        for(int i = 0; i < ints.length;i++){
            int len = ints[i];
            System.out.println("====>数组拷贝结果：" + len);
        }
    }

    public static void main(String[] args){
        testCopy();
    }
}