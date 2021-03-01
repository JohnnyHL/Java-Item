package com.hl.magic.base.io.demo02;

import org.junit.Test;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Imgs04 {

    @Test
    public void run2() throws IOException{
        File srcFile = new File("E:\\Study\\Test\\imgs\\B.jpg");
        File destFile = new File("E:\\Study\\Test\\imgs\\C.jpg");
        ZipInputStream zin = new ZipInputStream(new FileInputStream(srcFile));
        ZipEntry entry;
        while ((entry = zin.getNextEntry()) != null){
            zin.closeEntry();
        }
        zin.close();
    }

    @Test
    public void run1() throws IOException{
        File srcFile = new File("E:\\Study\\Test\\imgs\\B.jpg");
        File destFile = new File("E:\\Study\\Test\\imgs\\C.jpg");
        //图片损坏，无法打开
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
            bos.flush();
        }
        bos.close();
        bis.close();
    }
}
