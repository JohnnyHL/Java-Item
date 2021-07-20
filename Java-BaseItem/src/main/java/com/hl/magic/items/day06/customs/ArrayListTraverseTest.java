package com.hl.magic.items.day06.customs;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * ArrayList集合遍历
 *
 * 和数组遍历一模一样，即索引思想。
 * 集合的索引从0开始，到size() - 1;
 * 取元素方法：get(int index);
 *
 * @author HL
 * @date 2021/3/23 20:45
 */
public class ArrayListTraverseTest {

    private ArrayList<String> arrayList;
    @Before
    public void init(){
        arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("Java");
        arrayList.add("is");
        arrayList.add("good");
        System.out.println("=====>存储元素：" + arrayList);
    }
    /**
     * for循环遍历集合
     */
    @Test
    public void test_For_Traverse() {
        for (int i = 0; i < arrayList.size(); i++) {
            String data = arrayList.get(i);
            System.out.println("=====>for循环遍历集合：" + data);
        }
    }
    /**
     * foreach循环遍历集合
     */
    @Test
    public void test_ForEach_Traverse() {
        for (String data:arrayList) {
            System.out.println("=====>for循环遍历集合：" + data);
        }
    }

    /**
     * foreach循环遍历集合
     */
    @Test
    public void test_ForEach1_Traverse() {

    }
}
