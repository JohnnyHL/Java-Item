package com.hl.magic.base.collection.list;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 数组列表
 * ArrayList集合存储结构：数组结构
 * 使用较多：查询数据、遍历数据，线程不安全，元素增删慢，查询快。
 *
 * @author hl
 * @date 2020/3/30 15:12
 */
public class ArrayListBaseTest {

    /**
     * 要分配的最大数组的长度
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    @Test
    public void run1() {
        ArrayList<String> arrayList = new ArrayList<>();
        //将元素添加在指定位置索引上
        arrayList.add(0, "array");
        arrayList.add(1, "array1");
        arrayList.add(2, "array2");
        System.out.println(arrayList);

        //获取指定元素第一次出现的位置索引
        int indexOf = arrayList.indexOf("array1");
        System.out.println(indexOf);

        //设置指定位置索引的元素
        String new123 = arrayList.set(0, "new123");
        System.out.println(new123);
        System.out.println(arrayList);
    }

    @Test
    public void run2() {
        System.out.println("数组最大长度：" + MAX_ARRAY_SIZE);
    }

    @Test
    public void run3() {
        ArrayList arrayList = new ArrayList();
        //将元素添加在指定位置索引上
        arrayList.add("A0");
        arrayList.add("A1");
        arrayList.add("A2");
        arrayList.add("A3");
        arrayList.add("A4");
        arrayList.add("A5");
        arrayList.add("A6");
        arrayList.add("A7");
        arrayList.add("A8");
        arrayList.add("A9");
        arrayList.add("A10");

        arrayList.get(0);
    }
}
