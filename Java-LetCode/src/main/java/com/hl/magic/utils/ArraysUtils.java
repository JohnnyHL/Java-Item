package com.hl.magic.utils;

import java.util.Arrays;

/**
 * 数组工具类
 * @author hl
 * @date 2021/3/8 11:23
 */
public class ArraysUtils {

    /**
     * @param arrays
     * @return
     */
    public static int[] convertToIntArray(int[] arrays){
        System.out.print("[");
        for (int i = 0; i < arrays.length; i++) {
            if(i == arrays.length - 1 ){
                System.out.print(arrays[i]+"]");
            } else {
                System.out.print(arrays[i] +",");
            }
        }
        return arrays;
    }

    public static String convertToString(int[] arrays){
        Arrays.sort(arrays);
        String result = Arrays.toString(arrays);
        System.out.println("===>" + result);
        return result;
    }
}
