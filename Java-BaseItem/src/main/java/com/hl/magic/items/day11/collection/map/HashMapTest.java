package com.hl.magic.items.day11.collection.map;

import com.hl.magic.items.day11.collection.Person11;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 访问List集合元素时，可根据元素的索引来访问
 * 访问Map集合元素时，可根据每项元素的key来访问其value，
 * 访问Set集合中的元素时，只能根据元素本身来访问
 *
 * 集合类就像容器，无非就是添加对象、删除对象、清空容器、判断容器是否为空，集合类九尾这些功能提供了对应的方法。
 *【1】Map集合
 *	常用集合：HashMap集合、LinkedHashMap集合
 *	Collection中的集合为单列集合，Map中的集合为双列集合
 *	Map中的集合不能存储重复的键Key，但是可以存储重复的value
 * @author hl
 * @date 2020/3/5
 */


public class HashMapTest {

    @Test
    public void test_HashMap(){
        Map<String, Person11> map = new HashMap<>(16);
        Person11 person = new Person11();
        person.setId(UUID.randomUUID().toString().replace("-", ""));
        person.setAge(10);
        person.setName("小明");
        map.put("personInfo",person);
        System.out.println("==========>" + map.get("personInfo"));
    }
}
