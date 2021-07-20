package com.hl.magic.items.simple.arrays;

import com.hl.magic.items.utils.ArraysUtils;

import java.util.Arrays;

/**
 * 997.有序数组的平方
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *
 * 示例 1：
 *      输入：nums = [-4,-1,0,3,10]
 *      输出：[0,1,9,16,100]
 *      解释：平方后，数组变为 [16,1,0,9,100]
 *      排序后，数组变为 [0,1,9,16,100]
 *
 * 示例 2：
 *      输入：nums = [-7,-3,2,3,11]
 *      输出：[4,9,9,49,121]
 *
 * @author HL
 * @date 2021/3/10 15:29
 */
public class Arrays_Simple_No997 {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] sortedSquares = sortedSquares(nums);
        ArraysUtils.convertToString(sortedSquares);
    }
    public static int[] sortedSquares(int[] nums) {
        int[] array = new int[nums.length];
        int temp;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i] * nums[i];
            array[i] = temp;
        }
        Arrays.sort(array);
        return array;
    }

    public static int[] sortedSquares2(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i] * nums[i];
        }
        Arrays.sort(array);
        return array;
    }
}
