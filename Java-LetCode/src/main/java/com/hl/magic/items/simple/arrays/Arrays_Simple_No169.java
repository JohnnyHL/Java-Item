package com.hl.magic.items.simple.arrays;

import com.hl.magic.items.utils.ArraysUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 主要元素（多数元素）
 *  数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1；
 * 示例：
 * 输入：[1,2,5,9,5,9,5,5,5]
 * 输出：5
 *
 * 输入：[3,2]
 * 输出：-1
 *
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 *
 * @author hl
 * @date 2021/3/8 14:21
 */
public class Arrays_Simple_No169 {
    public static void main(String[] args) {
//        int[] nums = {1,2,5,9,5,0,5,5,5};
        int[] nums = {2,2,2,3,3,4,4};
//        int result = solution_for(nums);
        int result = solution_hash(nums);
        System.out.println("==>输出：" + result);

        ArraysUtils.convertToString(nums);

    }

    /**
     * 暴力穷举法
     *
     * @param nums
     * @return
     */
    public static int solution_for(int[] nums){
        Arrays.sort(nums);
        int len = nums.length;
        int temp = 1;
        if(len==1){
            return nums[0];
        }
        for (int i = 0; i < len-1; i++) {
                if(nums[i+1] == nums[i]){
                    temp++;
                    if(temp > (len / 2)){
                        return nums[i];
                    }
                }else {
                    temp=1;
            }
        }
        return -1;
    }

    /**
     * 哈希表
     *
     * @param nums
     * @return
     */
    public static int solution_hash(int[] nums){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num)+1);
            } else {
                hashMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> integerEntry : hashMap.entrySet()) {
            if (integerEntry.getValue() > nums.length/2){
                return integerEntry.getKey();
            }
        }
        return -1;
    }
}
