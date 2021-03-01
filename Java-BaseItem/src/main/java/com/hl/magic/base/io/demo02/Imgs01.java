package com.hl.magic.base.io.demo02;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * I/O流对图片的读写处理
 * 高效字节流，每次读1024个字节
 */
public class Imgs01 {

    @Test
    public void run1() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(new File("E:\\Other\\photo\\1.jpg")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("E:\\Other\\photo\\A.jpg")));
            byte[] bytes = new byte[1024];
            int len;
            //高效字节流，每次读1024个字节
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
                bos.flush();
            }
        } catch (IOException e) {
            System.out.println("资源释放失败");
        } finally {
            if (bis != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    System.out.println("资源释放失败");
                } finally {
                    if (bos != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            System.out.println("资源释放失败");
                        } finally {
                            System.out.println("资源释放成功");
                        }
                    }
                }
            }
        }
    }
}
