package com.hl.magic.items.day10.javaapi.stringdemo;

/**
 * @author hl
 * @date 2020/1/6
 */
public class StringBuilderTest {

    public static String printS(int[] arr) {
        //创建字符串缓冲区
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        //数组遍历
        for (int i = 0; i < arr.length; i++) {
            //判断是否为数组的最后一个元素
            if (i == arr.length - 1) {
                //追加元素
                buffer.append(arr[i]).append("]");
            } else {
                buffer.append(arr[i]).append(",");
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        int[] arr = {23, 12, 68, 49};
        System.out.println(printS(arr));
    }
}
