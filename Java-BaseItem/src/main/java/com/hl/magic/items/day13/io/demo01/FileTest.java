package com.hl.magic.items.day13.io.demo01;

import org.junit.Test;

import java.io.*;

/**
 * @author hl
 * @date 2019/9/23
 */
public class FileTest {

    @Test
    public void fun1(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(new File("E:\\Study\\Test\\11111.txt")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("E:\\Study\\Test\\22222.txt")));
            byte[] bytes = new byte[50];
            int read = 0;
            while ((read = bis.read(bytes)) != -1) {
                bos.write(bytes, read, bytes.length);
                read = read + bytes.length;
            }
        } catch (IOException e) {
            System.out.println("资源释放失败");
        } finally{
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
                        } finally{
                            System.out.println("资源释放成功");
                        }
                    }
                }
            }
        }
    }
}
