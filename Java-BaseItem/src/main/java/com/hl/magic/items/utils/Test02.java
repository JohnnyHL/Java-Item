package com.hl.magic.items.utils;

import java.net.URL;

/**
 * @Author HL
 * @Date 2021/6/30 20:39
 */
public class Test02 {


    public Test02() {

        Class<? extends Test02> aClass = this.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        URL resource = classLoader.getResource("");
        String resourcePath = resource.getPath();

        String name = aClass.getName();
        System.out.println("========>" + name);


        String path = this.getClass().getClassLoader().getResource("").getPath();
        System.out.println("========>" + path);
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
    }
}
