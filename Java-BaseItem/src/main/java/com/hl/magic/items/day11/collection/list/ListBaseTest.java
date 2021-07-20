package com.hl.magic.items.day11.collection.list;

import com.hl.magic.items.day11.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * List中的方法测试
 * <p>
 * 【1】List接口中的抽象方法
 * 带有索引的方法均为List自己特有的方法，据此可以与Collection做区分
 * <p>
 * List集合存储数据的结构
 * 【1】堆栈
 * 数据先存储，后出栈(即，存进去的元素，要在它后面的元素依次取出后，才能取出该元素。例：装子弹)。
 * 栈的入口、出口均为栈的顶端位置。
 * 压栈：存元素。即元素存储到栈的顶端位置，栈中已有元素依次向栈底方向移动一个位置。
 * 弹栈：取元素。即栈顶端位置的元素取出，栈中已有元素依次向栈顶方向移动一个位置。
 * 【2】队列Queue
 * 先进去(即，存进去的元素，要在它前面的元素依次取出后，才能取出该元素)
 * 队列的入口、出口各占一侧
 * 【3】数组 Arrays
 * 查找元素快：通过索引，可以快速访问指定位置的元素
 * 增删元素慢：
 * 指定索引位置增加元素：需要创建一个新数组，将指定新元素存储在指定索引位置
 * 【4】链表
 * 单向链，
 * 线程不同步
 * 增删的速度快
 * 查询的速度慢
 * 【5】LinkedList集合
 * 查询速度慢
 * 增删速度快
 * LinkedList集合存储的数据结构是链表结构，提供了大量的首尾操作的方法。
 * void addFirst(E e);
 * void addLast(E e);
 * E  	getFirst();
 * E	getLast();
 * E	removeFirst();
 * E	removeLast();
 * 【6】vector集合
 * vector集合存储数据：数组
 * vector中特殊的取出方式：枚举类Enumeration，早期迭代器。
 * vector集合已被ArrayList替代，Enumeration已被迭代器Iterator替代。
 *
 * @author hl
 */

public class ListBaseTest {

    /**
     * 方法3：
     * E set(int index,E);
     * 修改指定索引上的元素
     * 返回被修改的元素
     */
    @Test
    public void fun1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //[1]新增集合元素
        System.out.println("===================================");
        list.add(4);
        System.out.println("[1]新的集合：" + list);

        System.out.println("===================================");
        //在列表的指定位置插入指定元素
        Integer a = list.set(0, 5);
        //返回被修改的元素
        System.out.println("[2]返回被修改的元素：" + a);
        System.out.println("[2]修改后的集合：" + list);

        /**
         * [3]将新元素插入到List集合中指定索引index处
         * 方法1：add(int index,Object obj)
         * 将元素插入到list集合指定索引index处,
         * 注意：带有索引的操作，防止索引越界
         *		java.lang.IndexOutOfBoundsException
         *		java.lang.ArrayIndexOutOfBoundsException
         *		java.lang.StringIndexOutOfBoundsException
         */
        System.out.println("===================================");
        list.add(0, 110);
        System.out.println("[3]在指定索引处插入新的元素后的集合：" + list);

        /**
         * [4]remove(int index);
         * 移除指定索引上的元素，该方法有返回值，E类型
         * 返回被删除之前的元素
         */
        System.out.println("===================================");
        Integer first = list.remove(1);
        System.out.println("[4]移除指定索引位置元素的集合：" + first);

        //[5]获取指定索引位置的元素
        System.out.println("===================================");
        Integer value1 = list.get(0);
        System.out.println("[5]获取指定索引位置的集合元素：" + value1);

        //[5]遍历的方式获取集合元素
        System.out.println("===================================");
        for (int i = 0; i < list.size(); i++) {
            Integer value2 = list.get(i);
            System.out.println("[5.1]for循环遍历的方式获取集合元素：" + value2);
        }

        System.out.println("===================================");
        for (Integer value3 : list) {
            System.out.println("[5.2]foreach遍历的方式获取集合元素：" + value3);
        }

        //[6]返回元素在集合中第一次出现的位置索引
        System.out.println("===================================");
        list.add(6);
        int indexOf = list.indexOf(2);
        System.out.println("[6]返回元素在集合中第一次出现的位置索引：" + indexOf);

        //[7]返回元素在集合中最后一次出现的位置索引
        System.out.println("===================================");
        int lastIndexOf = list.indexOf(6);
        System.out.println("[7]返回元素在集合中最后一次出现的位置索引：" + lastIndexOf);

        //[8]返回从索引fromIndex(包含)，到索引toIndex(不包含)出的所有集合元素组成的子集合
        System.out.println("===================================");
        List<Integer> subList = list.subList(0, 2);
        System.out.println("[8]截取的子集合：" + subList);

        for (Integer value4 : subList) {
            System.out.println("[8.1]遍历子集合元素：" + value4);
        }
    }

    /**
     * 返回指定类型集合对象
     */
    @Test
    public void test_run2() {
        List<Person> list = new ArrayList<>();
        Person person = new Person();
        person.setId("2c3875b2781841d4ab9b971a2de6665e");
        person.setName("小明");
        person.setAge(18);
        list.add(person);
        System.out.println("====》" + list);
    }

    /**
     * map集合操作
     */
    @Test
    public void run2() {
        Map<String, Object> map = new HashMap<>(16);
        Person person = new Person();
        person.setId("2c3875b2781841d4ab9b971a2de6665e");
        person.setName("小明");
        person.setAge(18);
        map.put("人员信息", person);
        map.put("博客地址", "http://www.baidu.com");
        map.put("CSDN地址", "http://www.baidu.com");
        System.out.println("map集合：" + map);
    }
}