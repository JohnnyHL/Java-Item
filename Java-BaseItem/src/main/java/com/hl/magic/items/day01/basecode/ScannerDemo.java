package com.hl.magic.items.day01.basecode;

import java.util.Scanner;

/**
 * @Author HL
 * @Date 2021/5/7 21:20
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //从键盘接收输入
        System.out.println("next方式接收：");

        //判断是否还有输入
        if (scanner.hasNext()) {
            //输入字符串，不包含尾部空格
//            String next = scanner.next();
//            System.out.println("输入的数据：" + next);

            //输入字符串，包含字符串
//            String nextLine = scanner.nextLine();
//            System.out.println("输入的数据：" + nextLine);

            //输入整数
            int nextInt = scanner.nextInt();
            System.out.println("输入的整数数据：" + nextInt);
        }
        scanner.close();

    }

}
