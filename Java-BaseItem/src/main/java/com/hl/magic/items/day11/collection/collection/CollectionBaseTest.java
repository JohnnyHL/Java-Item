package com.hl.magic.items.day11.collection.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection接口
 * 父类接口：Iterable
 * 【1】实现Collection接口所有子类都会进行方法重写
 * 常用子接口：List接口、Set接口
 * List接口常用子类：ArrayList类、LinkedList类
 * Set接口常用子类：HashSet类、LinkedHashSet类
 * <p>
 * 【2】Collection接口概述
 * Collection接口是集合中的顶层接口的根接口，Collection表示一组对象，这些对象也称为 collection 的元素。
 * <p>
 * 【3】Collection接口中的方法
 * 是集合中接口实现类必须拥有的方法(共性的方法抽取)
 * 使用Collection接口的实现类进行演示
 * ArrayList implements List
 * List extends  Collection
 * 方法的执行都是实现类的重写方法
 * boolean add();	存储对象
 * void clear();	清空集合Collection中的对象
 * boolean contains(Object o); 判断对象是否存在于这个Collection集中
 * boolean remove(Object o);	移除Collection中指定元素
 * int size();	返回集合Collection中元素的个数
 * Object[] toArray();	包含此集合Collection中索引元素的数组
 * 将集合转成数组,所有集合中的元素转成一个数组中的元素
 * <p>
 * 【4】三种长度表现形式
 * 1.数组的长度，数组.length，返回类型int
 * 2.字符串的长度，字符串.length()，返回类型int
 * 3.集合长度，集合size()方法，返回类型int
 * <p>
 * 【5】创建集合的格式
 * Collection<元素类型> 变量名称= new Collection<元素类型>();
 * 只能存储<>中指定的元素类型，常用方式
 * <p>
 * Collection 变量名称  = new ArrayList();
 * 集合的元素类型默认为Object类型，即任何类型的元素都可以存储
 *
 * @author hl
 */
public class CollectionBaseTest {

    private static Collection<String> col = new ArrayList<>();

    /**
     * 返回集合的长度/元素个数；
     * int size(); 集合长度/元素个数
     */
    @Test
    public void test_size() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("9.数组的长度:" + arr.length);

        String str = "java";
        System.out.println("8.字符串的长度:" + str.length());

        Collection<String> collection = new ArrayList<>();
        collection.clear();
        collection.add("are");
        collection.add("you");
        collection.add("ok");
        collection.add("ok");
        int size = collection.size();
        System.out.println("7.集合的长度:" + size);
    }

    /**
     * 集合元素是否为空
     * boolean isEmpty();
     */
    @Test
    public void test_isEmpty() {
        Collection<String> collection = new ArrayList<>();
        collection.add("are");
        collection.add("you");
        collection.add("ok");
        collection.add("ok");
        boolean empty = collection.isEmpty();
        System.out.println("6.集合元素是否为空：" + empty);

        //清空集合元素
        collection.clear();
        boolean empty1 = collection.isEmpty();
        System.out.println("6.集合元素是否为空：" + empty1);

    }

    /**
     * 判断集合是否包含某个元素
     * boolean contains(Object o);
     */
    @Test
    public void test_contains() {
        Collection<String> collection = new ArrayList<>();
        collection.add("are");
        collection.add("you");
        collection.add("ok");
        collection.add("ok");
        boolean contains = collection.contains("are");
        System.out.println("5.集合元素are是否在集合中：" + contains);
    }

    /**
     * Iterator<E> iterator()；迭代方法
     */
    @Test
    public void test_iterator() {
        Collection<String> collection = new ArrayList<>();
        collection.add("are");
        collection.add("you");
        collection.add("ok");
        collection.add("?");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("集合迭代出的元素：" + next);
        }
    }

    /**
     * 返回包含此collection中元素的数组
     * 将集合中的元素转成数组中的元素
     * Collection toArray();
     */
    @Test
    public void test_toArray() {
        Collection<String> collection = new ArrayList<>();
        collection.add("are");
        collection.add("you");
        collection.add("ok");
        collection.add("ok");
        System.out.println("集合的元素：" + collection);
        Object[] arr = collection.toArray();
        System.out.print("集合转为数组后，遍历数组的结果：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                //最后一个元素
                System.out.print(arr[i].toString() + "]");
            } else {
                //不是最后一个元素
                System.out.print(arr[i].toString() + ",");
            }
        }
        System.out.println();
    }

    @Test
    public void test_toArrayAll() {
        Collection<String> collection = new ArrayList<>();
        collection.add("are");
        collection.add("you");
        collection.add("ok");
        collection.add("ok");
        System.out.println("集合的元素：" + collection);

        String[] strings = collection.toArray(new String[]{"as", "good"});

        for (String value : strings) {
            System.out.println("转为数组后：" + value);
        }
    }

    /**
     * boolean add(Object o);
     * 向集合中增加元素
     */
    @Test
    public void test_add() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println("集合中的元素：" + collection);

        collection.add("c");
        collection.add("c");
        System.out.println("增加了新元素后的集合：：" + collection);
    }

    /**
     * boolean remove(obj);
     * 移除集合中指定元素的单个实例
     * 按顺序，删除遇到的第一个指定的元素个例
     */
    @Test
    public void test_remove() {
        Collection<String> collection = new ArrayList<>();
        collection.add("are");
        collection.add("you");
        collection.add("ok");
        collection.add("ok");
        System.out.println("当前集合中的元素：" + collection);

        boolean a = collection.remove("how");
        System.out.println("移除集合中不存在的指定元素：" + a);

        boolean b = collection.remove("ok");
        System.out.println("移除集合中已存在的指定元素：" + b);

        System.out.println("移除指定元素后的新集合:" + collection);
    }

    /**
     * 2.清空集合中的元素
     * void clear();
     */
    @Test
    public void test_clear() {
        Collection<String> collection = new ArrayList<>();
        collection.add("are");
        collection.add("you");
        collection.add("ok");
        collection.add("ok");
        System.out.println("当前集合中的元素：" + collection);

        collection.clear();
        System.out.println("清空后的集合:" + collection);
    }

    /**
     * boolean equals(Object obj);
     */
    @Test
    public void test_equals() {
        Collection<String> collection = new ArrayList<>();
        collection.add("are");
        collection.add("you");
        collection.add("ok");
        System.out.println("当前集合中的元素：" + collection);

        boolean are = collection.equals("are");
        System.out.println("集合元素相等：：" + are);
    }

}