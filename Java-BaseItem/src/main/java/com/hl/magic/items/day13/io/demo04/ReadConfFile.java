package com.hl.magic.items.day13.io.demo04;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试度文件内容
 *
 * @author hl
 * @date 2020/3/10
 */
public class ReadConfFile {
    /**
     * 密码机IP地址配置文件路径
     */
    private static final String HSM_IP_ADDRESS_PATH = "E:\\Study\\IDEA_project\\JavaCoreReel\\conf\\hsmIPAddr.conf";

    @Test
    public void loadIpListFromFile() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(HSM_IP_ADDRESS_PATH)));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                boolean flag = !line.contains("#") || !line.startsWith("#");
                if (flag && !"".equals(line)) {
                    String[] split = line.split("\\|");
                    String ip = split[0].trim();
                    int port = Integer.parseInt(split[1].trim());
                    System.out.println("==========>" + ip + ":" + port);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}