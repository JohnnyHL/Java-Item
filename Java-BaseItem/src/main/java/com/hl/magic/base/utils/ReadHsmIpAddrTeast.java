package com.hl.magic.base.utils;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试工具类
 *
 * @author hl
 * @date 2020/1/17
 */
public class ReadHsmIpAddrTeast {

    private static final String HSM_IP_ADDRESS_PATH = "./conf/hsmIPAddr.conf";

    private static final List<String> ips = new ArrayList<>();

    public static void loadIpListFromFile() {
        ips.clear();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(HSM_IP_ADDRESS_PATH)));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                boolean flag = !line.contains("#") || !line.startsWith("#");
                if (flag && !"".equals(line)) {
                    String[] split = line.split("\\|");
                    ips.add(split[0].trim());
                    System.out.println("====>" + split[5]);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void fun1() {
        String hsmCode = "ATM,YSF";
        if (hsmCode.contains(",")) {
            String[] split = hsmCode.split(",");
            for (int i = 0; i < split.length; i++) {
                System.out.println("" + split[i]);
            }
        } else {
            System.out.println("===>" + hsmCode);
        }
    }

    public static void main(String[] args) {
        loadIpListFromFile();
    }
}