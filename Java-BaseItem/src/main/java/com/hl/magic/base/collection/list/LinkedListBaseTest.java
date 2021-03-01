package com.hl.magic.base.collection.list;

import org.junit.Test;

import java.util.LinkedList;

/**
 * 链表LinkedList-----单向链
 *      List接口的链接列表实现。实现所有可选的列表操作，并且允许所有元素（包括 null）。
 *      除了实现 List 接口外，LinkedList类还为在列表的开头及结尾 get、remove 和 insert 元素提供了统一的命名方法。
 *      这些操作允许将链接列表用作堆栈、队列或双端队列。
 *
 *      链表LinkedList实现 Deque 接口，为 add、poll 提供先进先出队列操作，以及其他堆栈和双端队列操作。
 *
 *
 * 【1】LinkedList特点
 * 线程不同步，线程不安全
 * 增删的速度快，查询的速度慢
 *
 * 【3】LinkedList集合存储的数据结构是链表结构，提供了大量的首尾操作的方法。
 * void addFirst(E e);
 * void addLast(E e);
 * E  	getFirst();
 * E	getLast();
 * E	removeFirst();
 * E	removeLast();
 *
 * @author hl
 * @date 2020/3/30 15:13
 */
public class LinkedListBaseTest {

    @Test
    public void test_LinkedList() {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("d");
        System.out.println("[1]链表：" + linkedList);
    }

    public static void main(String[] args) {

    }
}
