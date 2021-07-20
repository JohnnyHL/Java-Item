package com.hl.magic.items.day13.io.demo03;

import org.junit.Test;

/**
 * 对象的序列化和反序列化
 *
 * 写出对象，即对象的序列化：将对象中的数据，以流的形式，写入到文件中保存。对象--------->文件
 * 写入对象，即对象的反序列号：在文件中以流的形式将文件中的数据读取出来，还原给原来的对象。文件-------->对象
 *
 * ObjectOutStream，向流中写入对象的操作流，序列化流
 * ObjectInputStream，从流中读取对象的操作流，反序列化流
 *
 * @author hl
 */
public class PropertiesDemo02Test {

    @Test
    public void function(){
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("notepad.exe");
            Class cl = process.getClass();
            System.out.println(cl.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
