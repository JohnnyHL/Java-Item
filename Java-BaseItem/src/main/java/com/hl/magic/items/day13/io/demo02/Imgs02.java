package com.hl.magic.items.day13.io.demo02;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流_复制图片的4种方式
 */
public class Imgs02 {

    @Test
    public void run1() throws IOException{
        int i;
        String newImg;
        String newImgPrefix;
        //源图片
        String oldFile = "A.jpg";
        File srcFile = new File("E:\\Study\\Test\\imgs\\" + oldFile);
        //第一次存放时，文件不存在
        if (!srcFile.exists()) {
            File destFile = new File("E:\\Study\\Test\\imgs\\" + oldFile);
            //源文件路径
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
            //目标文件路径
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
            int len = 0;
            //高效字节流，每次只读取一个字节
            while ((len = bis.read()) != -1) {
                //输出流写文件
                bos.write(len);
            }
            bos.close();
            bis.close();
        }
        //第二次以后存放时
        String[] oldImgPrefix;
        if(srcFile.exists()){
            for (i = 1; i < 2; i++) {
                //切割旧的图片名,拿到新图片名的前缀
                oldImgPrefix = srcFile.getName().split("\\.");
                //拼接出新图片前缀名
                newImgPrefix = oldImgPrefix[0] + i;
                //拼接出新的图片名,前缀+ "."+后缀
                newImg = newImgPrefix + "." +oldImgPrefix[1];
                File destFile = new File("E:\\Study\\Test\\imgs\\" + newImg);
                //源文件路径
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
                //目标文件路径
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
                int len = 0;
                //高效字节流，每次只读取一个字节
                while ((len = bis.read()) != -1) {
                    //输出流写文件
                    bos.write(len);
                }
                bos.close();
                bis.close();
            }
        }
    }
}
