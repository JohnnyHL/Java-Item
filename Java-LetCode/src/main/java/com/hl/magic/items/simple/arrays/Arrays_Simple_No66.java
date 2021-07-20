package com.hl.magic.items.simple.arrays;

/**
 * 66.加一
 *
 * @Author HL
 * @Date 2021/4/27 21:29
 */
public class Arrays_Simple_No66 {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1]++;
            return digits;
        } else {
        }
        return new int[0];
    }
}
