package com.hl.magic.items.day03.cycle;

import org.junit.Test;

/**
 * while循环常用于不确定循环次数的情况；用在已知循环次数的情况时，等同于for循环
 *
 * @author hl
 * @date 2020/1/8
 */
public class CycleForTest {


    @Test
    public void test_for() {
        int sum = 0;
        int len = 100;
        for (int i = 1; i <= len; i++) {
            sum += i;
        }
        System.out.println("从1到100的数总和：" + sum);

    }

    /**
     * while循环
     * 先执行循环条件，再执行循环体
     */

    @Test
    public void test_while() {
        int sum = 0;
        int i = 1;
        int len = 100;
        while (i <= len) {
            sum += i;
            i++;
        }
        System.out.println("从1到100的数总和：" + sum);
    }

    /**
     * do...while循环
     * 先执行循环体语句，在执行循环条件
     */
    @Test
    public void test_do_while(){
        int count = 1;
        do {
            System.out.println("do while循环");
            count++;
        }while (count <= 5);
    }

    /**
     * 三目运算符
     */
    @Test
    public void test_3mu(){
        int a = 10 > 11 ? 10: 12;
        System.out.println("======>" + a);
    }

    /**
     * 打印出九九乘法表
     * for循环，外层循环变量i取值范围1~9，而内层循环变量j的取值范围是1~i.
     * 打印时要在恰当地方换行
     */
    @Test
    public void testGet99Table_OK() {
        int i, j;
        System.out.println("九九乘法表");
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
