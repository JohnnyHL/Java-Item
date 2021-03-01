package com.hl.magic.base.io.demo03;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Properties类表示一个持久的属性集。
 * Properties可保存在流中或从流中加载。属性列表中每个键key及其对应值value都是一个字符串。
 * 特点：
 * 		1.Hashtable的子类，实现map接口，即map集合中方法都可以用。
 * 		2.该集合没有泛型。键值都是字符串
 * 		3.可以和IO对象结合使用，它是一个可持久化的属性集。键值可以存储到集合中，也可以存储到持久化的设备上。键值的来源也可以是持久化的设备。
 * 		4.有和技术相关的方法。
 * @author hl
 */
public class PropertiesDemo01Test {
    /**
     * 【3】Properties集合特有方法 store
     * 1.store(OutputStream out, String comments)
     * 将此属性列表（键和元素对）写入此 Properties表中，以适合于使用 load(InputStream)方法加载到 Properties表中的格式输出流。
     * 2.store(Writer writer, String comments)
     * 将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式输出到输出字符流。
     *
     * 接收所有的字节或者字符的输出流，将集合中的键值对，写回文件中保存。
     * @throws IOException
     */
    @Test
    public void run4() throws IOException{
        Properties pro = new Properties();
        //存数据
        pro.setProperty("id","1");
        pro.setProperty("name", "westone");
        pro.setProperty("age", "20");
        pro.setProperty("address", "chengdu");
        //设定目标文件
        FileWriter fWriter = new FileWriter(new File("E:\\Study\\Test\\io\\pro.properties"));
        //键值对，存回pro.propertties文件，使用集合方法store传递字符输出流
        pro.store(fWriter, "cun chu chenggong");
        fWriter.close();
    }
    /**
     * 【2】Properties集合特有方法 load
     * [1]load(InputStream input)
     * [2]load(Reader reader)
     * 传递任意的字节或者字符的输入流
     * load方法流对象读取文件中的键值对【key-value】，保存到集合中去
     */
    @Test
    public void run3() throws IOException{
        Properties pro = new Properties();
        FileInputStream fis = new FileInputStream(new File("E:\\Study\\Test\\io\\pro.properties"));
        pro.load(fis);
        fis.close();
        System.out.println("3.load(Inputstream ins)方法从文件中读取集合数据:" + pro);
    }
    @Test
    public void run2() throws IOException{
        Properties pro = new Properties();
        FileReader fr = new FileReader(new File("E:\\Study\\Test\\io\\pro.properties"));
        //调用集合的方法load(),传递字符的输入流
        pro.load(fr);

        //根据key获取value
        String address = pro.getProperty("address");
        System.out.println("=====>" + address);

        fr.close();
        System.out.println("2.load(Reader reader)从文件中读取到的集合数据：" + pro);
    }

    /**
     * 【1】使用Properties集合，存储键值对
     * [1]setProperties(String key,String value) 等同于map接口中的put()方法
     * [2]getProperty(String key),使用此属性列表中指定的键搜索属性,通过键获取值。
     * [3]setPropertyNames,将集合中的键集存储到set集合中，方法类似于map接口的方法keySet
     */
    @Test
    public void run1(){
        Properties pro = new Properties();
        //存数据
        pro.setProperty("id","1");
        pro.setProperty("name", "小明");
        pro.setProperty("age", "12");
        System.out.println("存入的键值：" + pro);
        //获取数据
        String value = pro.getProperty("name");
        System.out.println("获取的数值：" + value);
        //较少使用
        Set<String> set = pro.stringPropertyNames();
        for(String key :  set){
            System.out.println("键值对输出：" + key + "：" + pro.getProperty(key));
        }
    }
}
