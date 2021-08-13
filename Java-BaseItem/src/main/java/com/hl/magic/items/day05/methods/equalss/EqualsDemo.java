package com.hl.magic.items.day05.methods.equalss;

/**
 * @Author HL
 * @Date 2021/8/12 12:08
 */
public class EqualsDemo {
    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");

        String aa = "ab";
        String bb = "ab";

        System.out.println("aa==bb: " + (aa == bb));
        System.out.println("a==b: " + (a == b));
        System.out.println("a.equals(b): " + (a.equals(b)));
        System.out.println("42 == 42.0 : " + (42 == 42.0));
    }
}
