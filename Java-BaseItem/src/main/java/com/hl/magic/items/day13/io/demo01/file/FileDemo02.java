package com.hl.magic.items.day13.io.demo01.file;

import org.junit.Test;

import java.io.File;

/**
 * [2]File类的判断功能
 *
 * @author hl
 */
public class FileDemo02 {

    /**
     * File[] listRoots();
     * 列出可用的文件系统根。
     */
    @Test
    public void testListRoots_OK() {
        File[] fileArr1 = File.listRoots();
        for (File file2 : fileArr1) {
            System.out.println(file2);
        }
    }

    /**
     * File[] listFiles()
     * 获取到File构造方法中封装的路径中的文件和文件夹名(遍历一个目录)
     * 返回值：返回目录或者文件的全路径
     * 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件
     */
    @Test
    public void testListFiles_OK() {
        File file = new File("E:\\Study\\Test\\file");
        File[] fileArr = file.listFiles();
        for (File str : fileArr) {
            System.out.println(str);
        }
    }

    /**
     * String[] list
     * 获取到File构造方法中封装的路径中的文件和文件夹名(遍历一个目录)
     * 返回值：返回的只有文件的名
     * 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
     */
    @Test
    public void testFileList_OK() {
        File file = new File("E:\\Study\\Test\\file");
        String[] strArr = file.list();
        System.out.println(strArr);
        //三目运算符遍历文件夹目录
        for (String str : strArr) {
            System.out.println(str);
        }
    }

    /**
     * boolean exists()
     * 判断File构造方法中封装的路径是否存在
     * 存在返回true,不存在返回false
     */
    @Test
    public void testFileExists_OK() {
        File file = new File("E:\\Study\\Test\\file\\Java8Threads.doc");
        boolean b1 = file.exists();
        if (file.exists()) {
            boolean b2 = file.isDirectory();
            System.out.println(b2);
        }
        System.out.println(b1);
    }
}
