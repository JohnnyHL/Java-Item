package com.hl.magic.items.day05.methods.string;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author HL
 * @Date 2021/8/10 16:44
 */
public class StringBase3Demo {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringBase2Demo.class);

    @Test
    public void run1() {
        byte[] da = null;
        try {
            int length = new String(da).length();
            LOGGER.debug("=====>null的长度{}", length);
        } catch (Exception e) {
            throw new NullPointerException("抛一个空指针异常");
        }
    }

    @Test
    public void run2(){
    }
}
