package com.hl.magic.items.day04.arrays.array;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 数组
 * @author hl
 */
public class ArrayTraverseTest {

    /**
     * 常规for循环
     */
    @Test
    public void case1(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
    }

    /**
     * for each循环
     */
    @Test
    public void case3(){
        Map<String,String> map = new HashMap<>(16);
        map.put("name","小明");
        map.put("age","18");
        map.put("address","chengdu");
        System.out.println("map集合：" + map);

        //调用keySet()方法，将key存放到set集合中
        Set<String> set = map.keySet();
        System.out.println("=============================迭代器遍历==================================");
        //对set集合进行迭代
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            //返回迭代的下一个元素
            String key = iterator.next();
            //通过key获取value
            String value = map.get(key);
            System.out.println(key + "......" + value);
        }

        System.out.println("============================forEach遍历=================================");
        for (String key2:set){
            //通过key获取value
            String value2 = map.get(key2);
            System.out.println(key2 + "......" + value2);
        }

        System.out.println("===========================简化forEach遍历==============================");
        for (String key3 : map.keySet()){
            //通过key获取value
            System.out.println(key3 + "......" + map.get(key3));
        }
    }
}
