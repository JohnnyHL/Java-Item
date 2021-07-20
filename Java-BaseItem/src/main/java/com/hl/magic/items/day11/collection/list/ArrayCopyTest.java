package com.hl.magic.items.day11.collection.list;

import java.util.Arrays;

/**
 * 数组复制的几种方式
 *
 * @author hl
 * @date 2020/4/7 9:23
 */
public class ArrayCopyTest {

    /**
     * System.arraycopy(srcArray, srcIndex, destArray, destIndex, length);
     */
    public static void test_SystemArrayCopy(String[] srcArray) {
        long start = System.nanoTime();
        String[] destArray = new String[srcArray.length];
        System.arraycopy(srcArray, 0, destArray, 0, destArray.length);
        long end = System.nanoTime();
        System.out.println("System.arraycopy()方法耗时：" + (end - start) + " ms");
    }

    /**
     * Arrays.copyOf(srcArray, length);
     */
    public static void test_ArraysCopyOf(String[] srcArray) {
        long start = System.nanoTime();
        String[] dest = new String[srcArray.length];
        dest = Arrays.copyOf(srcArray, srcArray.length);
        long end = System.nanoTime();
        System.out.println("Arrays.copyOf()方法耗时：" + (end - start) + " ms");
    }

    public static void test_CopyOfRange(String[] srcArray){
        long start = System.nanoTime();
        String[] destArray = new String[srcArray.length];
        destArray = Arrays.copyOfRange(srcArray,0,srcArray.length);
        long end = System.nanoTime();
        System.out.println("Arrays.copyOfRange()耗时：" + (end - start) + " ms");
    }

    /**
     * srcArray.clone();
     */
    public static void test_Clone(String[] srcArray) {
        long start = System.nanoTime();
        String[] dest = new String[srcArray.length];
        dest = srcArray.clone();
        long end = System.nanoTime();
        System.out.println("clone()方法耗时：" + (end - start) + " ms");
    }

    /**
     * for循环
     */
    public static void test_for(String[] srcArray) {
        long start = System.nanoTime();
        String[] dest = new String[srcArray.length];
        for (int i = 0; i < srcArray.length; i++) {
            dest[i] = srcArray[i];
        }
        long end = System.nanoTime();
        System.out.println("for循环耗时：" + (end - start) + " ms");
    }

    public static void main(String[] args) {
        String[] srcArray = new String[100];
        for (int i = 0; i < srcArray.length; i++) {
            srcArray[i] = "ABC";
        }
        System.out.println("源数组长度：" + srcArray.length);
        test_SystemArrayCopy(srcArray);
        test_ArraysCopyOf(srcArray);
        test_CopyOfRange(srcArray);
        test_Clone(srcArray);
        test_for(srcArray);
    }
}
