package com.hl.magic.base.io;

import com.hl.magic.base.utils.FileUtils;
import com.hl.magic.base.utils.UuidGenerator;
import org.junit.Test;

import java.io.File;

/**
 * 文件大小转换测试
 * @author hl
 * @date 2020/8/21 11:25
 */
public class FileSizeConvertTest {

    /**
     * 文件大小转换
     */
    @Test
    public void test_formatFileSize(){
        String uuid = UuidGenerator.getUuid();
        System.out.println("=====>" + uuid);

        File file = new File("E:\\Study\\Test\\TestSignData.txt");
        double fileSize = FileUtils.formatFileSize(file.length(), FileUtils.FILE_SIZE_TYPE_KB);
        System.out.println("====>" + fileSize + "KB");
    }


    @Test
    public void test_path(){

        String osEnv = System.getProperty("os.name").toLowerCase();
        if (osEnv.contains("windows")) {
            System.out.println("=============>" + true);
        }

        String path = File.separator + "ABC" + File.separator;
        System.out.println("=============>" + path);
    }
}

