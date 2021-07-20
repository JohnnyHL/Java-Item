package com.hl.magic.items.day11.collection.collection;

import com.hl.magic.items.day11.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Collection集合遍历的
 *
 * Iterator迭代器
 * 【1】集合中的迭代器
 * 迭代器：获取集合中元素的一种迭代方式
 * Collection集合元素的通用获取方式；
 * 在之前先要判断集合中有没有元素，如果有，就取出
 * 继续再判断，如果有，就取出；直到把所有元素全部取出，这种取出方式即迭代
 * 
 * 【2】Iterator接口中的两个抽象方法
 * 		boolean hasNext();判断集合中是否还有可以被取出的元素，如果有就返回true.
 * 		next();返回迭代中的下一个元素。 
 * 
 * 【3】Iterator接口实现
 * Collection接口中的方法
 * Iterator<E> iterator()
 * ArrayList重写方法iterator()，返回了Iterator接口的实现类的对象
 * 使用ArrayList集合的对象
 * 		Iterator it = arr.iterator();运行结果就是Iterator接口的实现类的对象
 * @author hl
 */
public class CollectionTraverseTest {

    /**
     * [1]foreach循环遍历集合元素
     *
     *	foreach循环遍历数组和集合元素时，无须获得数组和集合长度
     *			也无须根据索引来访问数组元素和集合元素.
     *  foreach循环能遍历数组，但是不能对数组中的元素进行增删操作
     *
     *	foreach循环自动遍历数组和集合的每个元素,遍历过程中不能对元素进行增删操作，不改变数组/集合的长度，手动更改将爆异常
     *	格式：
     *		for(元素的数据类型 变量 ：Collection集合 or 数组){
     *			....
     *		}
     * 好处：代码量少，方便对容器进行遍历
     * 弊端：没有索引，不能操作容器里边的元素
     */
    @Test
    public void run3(){
        List<Person> arr = new ArrayList<Person>();
        arr.add(new Person("a",20));
        arr.add(new Person("b",18));
        arr.add(new Person("c",22));
        for (Person person : arr) {
            System.out.println("人员信息：" + person);
        }
        for (Object obj : arr) {
            String book = (String) obj;
            System.out.println("forEach循环出的结果：:" + book);
            if (arr.equals("type")) {
                //移除元素
                arr.remove(obj);
            }
        }
        //集合并没有改变，增强for循环遍历且不改变集合元素
        System.out.println("增强for结果：" + arr);
    }


    /**
     * [2]使用Java 8增强的Iterator遍历集合元素
     *
     * 集合存储/迭代时，如果控制存储的数据类型？
     * Iterator接口可以使用<>来控制迭代元素的数据类型
     * Iterator仅用于遍历(迭代访问)集合，其本身并无盛装对象的能力。
     * Iterator对象也称为迭代器。
     *
     *  没有集合的Iterator将无价值。
     *
     * 常用方法如下：
     * boolean hasNext(); 如果被迭代的集合元素还没有遍历完，则返回true。
     * Object next();返回被迭代的集合下一个元素。
     * void forEachRemaining(Consumer c);Java 8新增，可以使用Lambda表达式遍历集合元素
     *
     * void remove();删除集合中上一次next()方法返回的元素
     * 这如果在迭代过程中，使用Collection集合的remove()方法，将报异常java.util.ConcurrentModificationException
     *
     */
    @Test
    public void test_Iterator() {
        Collection<String> col = new ArrayList<>();
        col.add("a");
        col.add("b");
        col.add("b");
        col.add("c");
        col.add("dd");
        //调用集合的方法iterator()迭代访问集合
        Iterator<String> it = col.iterator();
        //迭代反复执行取出，循环判断集合中是否有元素，true继续取出集合中的元素，false无元素
        while (it.hasNext()) {
            String value = it.next();
            System.out.println("Iterator迭代访问集合元素：" + value);

            //it.remove();
            //System.out.println("通过迭代器删除集合元素：" + value);

            //boolean remove = col.remove("dd");
            //System.out.println("通过Collection来删除集合元素：" + remove);

            //给迭代出的元素赋值
            //Iterator对迭代遍历集合元素时，仅仅是把集合元素的值传递给了迭代变量，修改迭代变量的值对集合不产生任何影响
            value = "赋值";
        }
        System.out.println("新的集合：" + col);
    }

    /**
     * [3]使用Lambda表达式遍历集合
     */
    @Test
    public void test_lambda(){
        Collection col = new ArrayList<>();
        col.add("a");
        col.add("b");
        col.add("b");
        col.add("lambda");
        col.forEach(obj-> System.out.println("使用Lambda表达式遍历集合：" + obj));
    }

    /**
     * [4] 使用Lambda表达式遍历Iterator
     */
    @Test
    public void test_LambdaIterator(){
        Collection col = new ArrayList<>();
        col.add("a");
        col.add("b");
        col.add("b");
        col.add("lambda");

        Iterator iterator = col.iterator();
        //使用Lambda表达式遍历Iterator
        iterator.forEachRemaining(obj -> System.out.println("使用Lambda表达式遍历Iterator：" + obj));
    }
}