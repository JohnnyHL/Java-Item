package com.hl.magic.items.day13.io.demo01.file;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * [1]File类的获取功能
 *
 * @author hl
 */
public class FileDemo01 {

    private static final Logger logger = LoggerFactory.getLogger(FileDemo01.class);

    /**
     * String getAbsolutePath();	返回String对象，返回此抽象路径名的绝对路径名字符串。
     * File getAbsoluteFile();	返回File对象，返回此抽象路径名的绝对路径名形式。等同于 new File(this.getAbsolutePath())。
     * 获取绝对路径
     */
    @Test
    public void testFilePath_OK() {
        File file = new File("E:\\Study\\Test\\file\\Java8Threads.doc");
        if (!file.exists()) {
            logger.error("文件不存在");
        }
        //获取文件绝对路径
        String abs1 = file.getAbsolutePath();
        System.out.println(abs1);

        //返回此抽象路径名父目录的路径名字符串
        String abs2 = file.getParent();
        System.out.println(abs2);

        //获取文件的父路径，返回此抽象路径名父目录的抽象路径名
        File abs3 = file.getParentFile();
        System.out.println(abs3);
    }

    /**
     * long length()
     * 返回由此抽象路径名表示的文件的长度(字节数)。
     */
    @Test
    public void testFileLength_OK() {
        File file = new File("E:\\Study\\Test\\file\\Java8Threads.doc");
        long len = file.length();
        logger.debug("文件长度：{}个字节", len);
    }

    /**
     * Strin getName();
     * 返回由此抽象路径名表示的文件或文件夹的名称。
     * 获取路径中的最后部分的名字
     */
    @Test
    public void testFileName_OK() {
        File file = new File("E:\\Study\\Test\\file\\Java8Threads.doc");
        String name = file.getName();
        logger.debug("文件名称：{}", name);

        String prefixName = name.split("\\.")[0];
        logger.debug("文件前缀：{}", prefixName);

        String suffix = name.substring(name.lastIndexOf("."));
        logger.debug("文件后缀：{}", suffix);

    }
}
