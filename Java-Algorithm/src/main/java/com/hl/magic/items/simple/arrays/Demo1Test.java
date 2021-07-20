package com.hl.magic.items.simple.arrays;

import org.junit.Test;

import java.util.UUID;

/**
 * 输出大小写字母
 * A-Z：65-90
 * a-z：97-122
 *  实现步骤：
 *  1-定义变量，保存小写a，大写A
 *  2-循环26次，输出定义好的变量
 *      每次循环，变量++；
 *
 * @Author HL
 * @Date 2021/4/8 21:44
 * @Version 1.0
 */
public class Demo1Test {
    /**
     * 输入大小写字母
     */
    @Test
    public void loopTest() {
        char xiaoXie = 'a';
        char daXie = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.println(xiaoXie + " " + daXie);
            daXie++;
            xiaoXie++;
        }
    }

    @Test
    public void run1(){
        String replace = UUID.randomUUID().toString().trim();
        System.out.println("=======>" + replace);
    }
}
