package com.hl.magic.base.io.demo01.file;

import org.junit.Test;

import java.io.File;

/**
 * [3]File类的判断功能
 *
 * @author hl
 */
public class FileDemo03 {

    /**
     * boolean delete();
     * 删除此抽象路径名表示的文件或目录。
     */
    @Test
    public void testDelete_OK() {
        File file = new File("E:\\Study\\Test\\file\\OK");
        boolean flag = file.delete();
        if (flag) {
            System.out.println("文件夹删除成功");
        } else {
            System.out.println("文件夹删除失败");
        }
    }

    /**
     * mkdir();
     * 创建此抽象路径名指定的目录。
     */
    @Test
    public void testMkdir_OK() {
        File file = new File("E:\\Study\\Test\\file\\OK");
        boolean flag = file.mkdir();
        if (flag) {
            System.out.println("文件夹创建成功");
        } else {
            System.out.println("该文件夹已存在");
        }
    }

    /**
     * boolean exists();
     * 测试此抽象路径名表示的文件或目录是否存在。
     */
    @Test
    public void testExists_OK() {
        File file = new File("E:\\Study\\Test\\file\\11111.txt");
        boolean flag = file.exists();
        if (flag) {
            System.out.println("该文件已存在");
        } else {
            System.out.println("该文件不存在");
        }
    }

    /**
     * File[] listFiles()
     * 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
     */
    @Test
    public void testListFiles_OK() {
        File file = new File("E:\\Study\\Test\\file");
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            System.out.println(file2);
        }

    }

    /**
     * String[] list();
     * 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录
     */
    @Test
    public void testList_OK() {
        File file = new File("E:\\Study\\Test\\file");
        String[] list = file.list();
        for (String str : list) {
            System.out.println(str);
        }
    }

    @Test
    public void testListRoots_OK() {
        File[] listRoots = File.listRoots();
        for (File file : listRoots) {
            System.out.println(file);
        }
    }
}
