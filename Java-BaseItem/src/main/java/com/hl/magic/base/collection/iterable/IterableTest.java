package com.hl.magic.base.collection.iterable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 迭代器接口：Interface Iterable<T>
 *
 * @author hl
 * @date 2020/3/12
 */
public class IterableTest {

    /**
     * Collection集合元素迭代
     */
    @Test
    public void test_iterator(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");

        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){

            String next = iterator.next();
            System.out.println("collection集合元素的迭代结果：" + next);
        }
    }
}
