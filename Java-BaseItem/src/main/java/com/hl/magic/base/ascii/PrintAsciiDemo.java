package com.hl.magic.base.ascii;

/**
 * ASCII码--------测试类
 * 48-57----------0-9
 * A-Z----------65-90
 * a-z----------97-122
 *
 * @author hl
 * @date 2020/1/8
 */
public class PrintAsciiDemo {

    public static void main(String[] args) {
        test_ConvertAscii();
    }

    public static void test_ConvertAscii() {
        char ch1 = 'A';
        System.out.println(ch1 +" 的ASCII码是： "+(int) ch1);
        char ch2 = 'Z';
        System.out.println(ch2 +" 的ASCII码是： "+(int) ch2);

        char ch3 = 'a';
        System.out.println(ch3 +" 的ASCII码是： "+(int) ch3);
        char ch4 = 'z';
        System.out.println(ch4 +" 的ASCII码是： "+(int) ch4);

        char ch5 = 48;
        System.out.println(ch5 +" 的ASCII码是： "+(int) ch5);
        char ch6 = 57;
        System.out.println(ch6 +" 的ASCII码是： "+(int) ch6);
    }
}