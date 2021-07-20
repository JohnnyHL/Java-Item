package com.hl.magic.items.day05.classes;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

/**
 * 字符串进阶操作
 *
 * @author hl
 * @date 2020/3/18 16:15
 */
public class StringAdvanceTest {

    @Test
    public void fun1() {
        String s = "1001eb2d4f04440595b06385914b9ebd,501bd5ca0ae94430add63d50e47e8347";
        if (s.contains(",")) {
            String[] split = s.split(",");
            for (String accountInfo : split) {
                System.out.println("==========>" + accountInfo);
            }
        } else {
            System.out.println("==========>3:" + s);
        }
    }

    @Test
    public void fun2() {
        String accountId = "['1001eb2d4f04440595b06385914b9ebd']";
        String substring = accountId.substring(1, accountId.length() - 1);
        System.out.println("====>1：" + substring);
        String s = substring.substring(1, substring.length() - 1);
        System.out.println("====>2：" + s);
    }

    @Test
    public void fun3() {
        int a = 300;
        int b = 1024;

        DecimalFormat df = new DecimalFormat("0.00");
        String format = df.format((double) a / b);
        System.out.println("======>" + format);
    }

    @Test
    public void fun4(){
        String[] str = new String[]{"10","11","12"};
        String tag = "10";

        List<String> list = Arrays.asList(str);
        boolean contains = list.contains(tag);
        System.out.println("====>" + contains);
    }
}