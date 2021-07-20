package com.hl.magic.items.simple.arrays;

import org.junit.Test;

/**
 * @Author HL
 * @Date 2021/4/8 21:53
 * @Version 1.0
 */
public class Demo2Test {
    @Test
    public void run1(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " +(j*i) + "  ");
            }
            System.out.println("  ");
        }
    }
}
