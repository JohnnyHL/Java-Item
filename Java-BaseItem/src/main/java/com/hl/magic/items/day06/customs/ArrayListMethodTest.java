package com.hl.magic.items.day06.customs;

import org.junit.Test;

import java.util.ArrayList;

/**
 * ArrayList集合中的方法
 *
 * 集合中存储的元素，只能为<>指定的数据类型元素
 * 且必须是引用数据类型，不能是基本数据类型。
 * Byte、Short、Integer、Long、Float、Double、Character、Boolean
 * 以及String、类、数组、接口
 *
 * @author HL
 * @date 2021/3/23 20:45
 */
public class ArrayListMethodTest {

    /**
     * ArrayList中的方法
     */
    @Test
    public void test_add() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        System.out.println("=====>存储元素：" + arrayList);

        int size = arrayList.size();
        System.out.println("=====>集合长度：" + size);

        String data = arrayList.get(1);
        System.out.println("=====>获取元素：" + data);

        arrayList.add(0,"EN");
        System.out.println("=====>在指定位置上插入元素：" + arrayList);

        String getData = arrayList.get(0);
        System.out.println("=====>获取指定位置上的元素：" + getData);

    }
}
