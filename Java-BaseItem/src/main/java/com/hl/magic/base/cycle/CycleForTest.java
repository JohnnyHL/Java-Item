package com.hl.magic.base.cycle;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * while循环常用于不确定循环次数的情况；用在已知循环次数的情况时，等同于for循环
 *
 * @author hl
 * @date 2020/1/8
 */
public class CycleForTest {

    private static final Logger logger = LoggerFactory.getLogger(CycleForTest.class);

    /**
     * 1.for循环的情况
     */
    @Test
    public void testForCycle() {
        int sum = 0;
        int len = 100;
        for (int i = 1; i <= len; i++) {
            sum += i;
        }
        logger.debug("从1到100的数总和:{}", sum);

    }

    /**
     * 2.while循环的情况
     */
    @Test
    public void testWhileCycle() {
        int sum = 0;
        int i = 1;
        int len = 100;
        while (i <= len) {
            sum += i;
            i++;
        }
        logger.debug("从1到100的数总和:{}", sum);
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
        logger.debug("九九乘法表");
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            logger.debug("\n");
        }
    }
}
