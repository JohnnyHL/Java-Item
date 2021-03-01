package com.hl.magic.base.ascii;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ASCII码--------测试类
 * <p>
 * 48-57----------0-9
 * A-Z----------65-90
 * a-z----------97-122
 *
 * @author hl
 * @date 2020/1/8
 */
public class PrintAsciiTest {

    private static final Logger logger = LoggerFactory.getLogger(PrintAsciiTest.class);

    @Test
    public void testConvertAscii() {

        char ch1 = 'A';
        logger.debug("{} 的ASCII码是：{}", ch1, (int) ch1);
        char ch2 = 'Z';
        logger.debug("{} 的ASCII码是：{}", ch2, (int) ch2);

        char ch3 = 'a';
        logger.debug("{} 的ASCII码是：{}", ch3, (int) ch3);
        char ch4 = 'z';
        logger.debug("{} 的ASCII码是：{}", ch4, (int) ch4);

        char ch5 = 48;
        logger.debug("{} 的ASCII码是：{}", ch5, (int) ch5);
        char ch6 = 57;
        logger.debug("{} 的ASCII码是：{}", ch6, (int) ch6);
    }
}