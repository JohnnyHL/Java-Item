package com.hl.magic.items.day13.io.demo01.fileinputsream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream字节输入流，读取字节
 * 从文件系统中的某个文件中获得输入字节，将读取内容输出到程序中
 *
 * [1]构造方法
 * 		FileInputStream(File file);
 * 		FileInputStream(String name);
 * [2]输入流读取文件的步骤
 * 		1.创建字节输入流的子类对象
 * 		2.调用读取方法read()
 * 		      每读取一个字节，将执行一次read()，返回int类型数据
 * 		3.关闭资源
 *
 * [1]读取字节数组方法
 * 	  int read(byte[] b)
 * 	  //循环去读取文件内容(字节)，每次读1个字节直到读完最后一个字节，返回-1
 * 	  read()方法的返回值，即从文件中读取的有效字节的个数。
 * [2]功能
 * 		能够读取任意文件
 * @author hl
 */


public class FileInputStreamTest {

    private static final String FILE_PATH = "E:\\Study\\Test\\file\\11111.txt";

    /**
     * FileInputStream字节输入流，读取字符
     */
    @Test
    public void testReadFileChar_OK()  {
        FileInputStream file = null;
        try {
            file = new FileInputStream(FILE_PATH);
            int len;
            //循环读取，读到最后一个字节后，返回-1
            while ((len = file.read()) != -1) {
                System.out.print((char)len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != file) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * FileInputStream字节输入流，读取字节数组
     */
    @Test
    public void testReadFileByte_OK() {
        FileInputStream file = null;
        try {
            file = new FileInputStream(FILE_PATH);
            byte[] bytes = new byte[1024];
            //循环去读取文件内容(字节)，每次读1个字节直到读完最后一个字节，返回-1
            while (file.read(bytes) != -1) {
                String str = new String(bytes);
                System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != file) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
