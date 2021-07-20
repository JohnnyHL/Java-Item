package com.hl.magic.items.day10.javaapi.arraysdemo;

import java.util.Arrays;

/**
 * @author hl
 * @date 2020/1/6
 */
public class ArrayUtilsTest {

    public static int[] run1(int[] arr) {
        Arrays.sort(arr);
        String str = Arrays.toString(arr);
        System.out.println("arr数组升序排列的结果：" + str);
        int[] result = new int[3];
        System.arraycopy(arr, 0, result, 0, 3);
        String str1 = Arrays.toString(result);
        System.out.println("筛选后的数组结果：" + str1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {85, 77, 59, 68, 78, 92, 90, 81, 69, 60};
        run1(arr);
    }
}
