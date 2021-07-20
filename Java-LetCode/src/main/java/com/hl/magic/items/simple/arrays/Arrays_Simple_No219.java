package com.hl.magic.items.simple.arrays;

/**
 * 219.存在重复元素 II
 * 给定一个整数数组和一个整数k，判断数组中是否存在两个不同的索引i和j，使得nums [i] = nums [j]，并且 i 和 j的差的 绝对值 至多为 k。
 *
 * @author HL
 * @date 2021/3/14 15:20
 */
public class Arrays_Simple_No219 {
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
