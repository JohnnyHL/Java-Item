package com.hl.magic.items.simple.arrays;

/**
 * 1550.存在连续三个奇数的数组
 * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
 * @author HL
 * @date 2021/3/10 21:20
 */
public class Arrays_Simple_No1550 {

    public boolean threeConsecutiveOdds(int[] arr) {
        if ( arr.length < 3 ){
            return false ;
        }
        for (int i = 0; i <=  arr.length -3; i++) {
            if((arr[i] * arr[i+1] * arr[i+2]) % 2 != 0){
                return true;
            }
        }
        return false;
    }
}
