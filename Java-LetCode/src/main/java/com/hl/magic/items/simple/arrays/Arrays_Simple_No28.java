package com.hl.magic.items.simple.arrays;

/**
 * 28.实现str()函数
 *
 * 实现strStr()函数。
 *
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 *
 * 考察点：KMP算法(字符匹配算法)
 *
 * @author HL
 * @date 2021/3/17 20:07
 */
public class Arrays_Simple_No28 {

    public static void main(String[] args) {
        String haystack = "haystack";
        String needle = "needle";
        strStr(haystack,needle);
    }

    public static int strStr(String haystack, String needle) {
        if(haystack == "" || needle == ""){
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
