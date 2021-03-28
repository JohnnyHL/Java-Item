package com.hl.magic.arrays;

/**
 * 存在重复元素 II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 *
 * @author HL
 * @date 2021/3/14 15:20
 */
public class No7Demo {
    public static void main(String[] args) {
        int[] nums = {99,99};
        int k = 2;
        containsNearbyDuplicate(nums,k);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2 || k < 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && k >= (int) Math.sqrt((i - j) * (i - j))) {
                    return true;
                }
            }
        }
        return false;
    }
}
