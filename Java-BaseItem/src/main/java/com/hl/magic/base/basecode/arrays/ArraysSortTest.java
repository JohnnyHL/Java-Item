package com.hl.magic.base.basecode.arrays;

import java.util.Arrays;

/**
 * 数组排序
 * @author Administrator
 */
public class ArraysSortTest {

    /**
     * 数组排序-sort()方法
     */
    public static void testSort(){
        int[] arr ={8,1,9,2,7,3,4,6,5};
        Arrays.sort(arr);
        for (int rr : arr){
            System.out.println(rr);
        }
    }
    public static void main(String[] args){
        testSort();
    }
}
