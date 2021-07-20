package com.hl.magic.items.day13.io.demo03;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 */
public class PropertiesDemo03Test {
    @Test
    public void run3() throws IOException{
        Properties pro = new Properties();
        FileInputStream fis = new FileInputStream(new File("E:\\学习资料\\javatest\\io\\pro.properties"));
        pro.load(fis);
        fis.close();
        System.out.println("3.load方法从文件中读取集合数据" + pro);
    }
    public static void run2() throws IOException{
        Properties pro = new Properties();
        FileReader fr = new FileReader(new File("E:\\学习资料\\javatest\\io\\pro.properties"));
        //调用集合的方法load(),传递字符的输入流
        pro.load(fr);
        fr.close();
        System.out.println("2.从文件中读取到的集合数据：" + pro);
    }

    public static void run1(){
        Properties pro = new Properties();
        pro.setProperty("a", "1");
        pro.setProperty("b", "2");
        pro.setProperty("c", "3");
        pro.setProperty("d", "4");
        String value = pro.getProperty("a");
        System.out.println("1、a键的值：" + value);
    }
}