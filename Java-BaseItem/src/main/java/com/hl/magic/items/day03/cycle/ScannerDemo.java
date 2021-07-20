package com.hl.magic.items.day03.cycle;

import java.util.Scanner;

/**
 * Scanner输入/输出
 * @author HL
 * @date 2021/3/3 21:15
 */
public class ScannerDemo {

    public static void main(String[] args) {
        test_scanner_next();
//        test_scanner_nextInt();
    }

    /**
     * 接收键盘输入的字符串数据
     */
    public static void test_scanner_next(){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("=======>" + next);
        scanner.close();
    }

    /**
     * 仅接受键盘输入的整数
     */
    public static void test_scanner_nextInt(){
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        System.out.println("=======>" + nextInt);
        scanner.close();
    }
}
