package com.hl.magic.base.io.demo02;

import org.junit.Test;

import java.util.UUID;

public class Imgs05 {

    @Test
    public void function() {
        String name = UUID.randomUUID().toString();
        System.out.println("1. " + name);

        String name1 = name.replace("-", "+");
        System.out.println("2. " + name1);

        String name2 = name1.substring(0, 4);
        System.out.println("3. " + name2);

        String name3 = name1.toUpperCase();
        System.out.println("4. " + name3);

        String name4 = name3.toLowerCase();
        System.out.println("5. " + name4);

        String[] split = name.split("\\-");
        for (int i = 0; i < split.length; i++) {
            System.out.println("6.字符切割后： " + split[i]);

        }
    }
}
