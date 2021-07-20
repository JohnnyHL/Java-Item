package com.hl.magic.items.day10.javaapi.stringdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hl
 * @date 2020/1/6
 */
public class StringBufferUtilsTest {

    /**
     * 将字符串以指定长度切割
     *
     * @param str 入参字符串
     * @param len 指定长度
     * @return
     */
    public static List<String> spiltString(String str, int len) {
        List<String> arrayList = new ArrayList<>();
        //从0索引处开始
        int begin = 0;
        int end = str.length() > len ? len : str.length();
        for (int i = 0; i < str.length(); i++) {
            if (begin <= str.length()) {
                //截取begin--end范围的字符串，包含begin,不包含end。
                String subString = str.substring(begin, end);
                if (!"".equals(subString)) {
                    //将截取的字符串放入集合中
                    arrayList.add(subString);
                }
                begin = i * len;
                end = begin + len > str.length() ? str.length() : begin + len;
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(spiltString(str, 2));
    }
}
