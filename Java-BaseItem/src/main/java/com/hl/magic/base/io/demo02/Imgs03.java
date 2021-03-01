package com.hl.magic.base.io.demo02;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class Imgs03 {

    /**
     * 源图片
     */
    private static final String SRC_FILE = "E:\\Study\\Test\\imgs\\A.jpg";

    /**
     * 目标图片
     */
    private static final String DEST_FILE = "E:\\Study\\Test\\imgs\\B.jpg";

    /**
     * 1.基本字节流，每次只读写一个字节
     */

    @Test
    public void run4() throws IOException {
        FileInputStream fis = new FileInputStream(SRC_FILE);
        FileOutputStream fos = new FileOutputStream(DEST_FILE);
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        fos.close();
        fis.close();
    }

    /**
     * 2.基本字节流，每次读写一个字节数组，长度1024字节;
     * 文件易损坏
     */
    @Test
    public void run3() throws IOException {
        FileInputStream fis = new FileInputStream(SRC_FILE);
        FileOutputStream fos = new FileOutputStream(DEST_FILE);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(bytes, 0, len);
            fos.flush();
        }
        fos.close();
        fis.close();
    }

    /**
     * 3.高效字节流，每次读写一个字节
     */
    @Test
    public void run2() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SRC_FILE));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DEST_FILE));
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        bos.close();
        bis.close();
    }

    /**
     * 4.高效字节流，每次读写一个字节数组
     * 批量产生不同名字的图片
     */
    @Test
    public void run1() throws IOException {
        //名称后缀
        String ImgSuffix = ".png";
        //图片
        String oldFile = "1.png";
        //源图片路径
        File srcFile = new File("E:\\Other\\photo\\" + oldFile);
        if (srcFile.exists()) {
            //每次执行将批量产生5张图
            for (int i = 0; i < 10; i++) {
                //新图片名使用UUID防止重名
                String newImg = UUID.randomUUID().toString().replace("-", "") + ImgSuffix;
                //目标图片路径
                File destFile = new File("E:\\Other\\photo\\" + newImg);
                //源文件放在字节缓冲流区间
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
                //目标文件路径
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
                byte[] bytes = new byte[1024];
                int len = 0;
                //高效输入字节流，每次只读取一个字节
                while ((len = bis.read(bytes)) != -1) {
                    //输出流写入文件
                    bos.write(bytes, 0, len);
                    bos.flush();
                }
                bos.close();
                bis.close();
            }
        }
    }
}