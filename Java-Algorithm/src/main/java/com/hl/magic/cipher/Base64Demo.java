package com.hl.magic.cipher;

import org.bouncycastle.util.encoders.Base64;
import org.junit.Test;

/**
 * @Author HL
 * @Date 2021/8/1 14:16
 */
public class Base64Demo {

    @Test
    public void run1(){
        String data = "hello world";
        String encode = Base64.toBase64String(data.getBytes());
        System.out.println(encode);
    }
}
