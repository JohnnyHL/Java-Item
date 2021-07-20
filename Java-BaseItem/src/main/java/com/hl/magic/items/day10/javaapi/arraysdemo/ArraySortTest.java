package com.hl.magic.items.day10.javaapi.arraysdemo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 数组排序---测试类
 *
 * @author hl
 * @date 2020/1/6
 */
public class ArraySortTest {

    private static final Logger logger = LoggerFactory.getLogger(ArraySortTest.class);

    /**
     * sort快排
     * toString(数组);
     * 返回指定数组的字符串形式
     */
    @Test
    public void testArraySort() {
        int[] arr = {1, 3, 0, 2, 5, 9, 7, 8};
        //对数组快速升序排列
        Arrays.sort(arr);
        logger.debug("快排结果：{}", arr);
        //将排序后的数组转为字符串，输出标准数组格式
        String str = Arrays.toString(arr);
        logger.debug("排序后转为字符串标准输出格式：{}", str);
    }

    /**
     * [2]binaarySearch(byte[] a, byte key)
     * 使用二分搜索法来搜索指定的 byte 型数组，以获得指定的值。
     * key：索引位数据
     * 返回结果：返回查找结果所处的索引位index值
     */
    @Test
    public void testBinarySearch() {
        int[] arr = {1, 2, 5, 7, 8};
        int index = Arrays.binarySearch(arr, 8);
        logger.debug("二分查找的索引结果：{}", index);
    }

    /**
     * 快速排序法
     * [1]sort();
     * 对数组进行升序排序
     */
    @Test
    public void testQuickSort() {
        int[] arr = {2, 5, 1, 7, 3, 8};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    @Test
    public void testSubmit() {
        String str = "192.168.6.123|6666|3";
        //字符串分隔
        String substring = str.substring(1);
        logger.debug("原字符串：{}",substring);

        //字符串切割
        String[] split = str.split("\\|");
        for (int i = 0; i < split.length; i++) {
            String strs = split[i].trim();
            logger.debug("字符串分隔：{}",strs);
        }
    }
}