package com.hl.magic.arrays;

import com.hl.magic.utils.ArraysUtils;

import java.util.Arrays;

/**
 * 三个数的最大乘积
 *
 * 方法一：排序
 * 首先将数组排序。
 * 如果数组中全是非负数，则排序后最大的三个数相乘即为最大乘积；如果全是非正数，则最大的三个数相乘同样也为最大乘积。
 * 如果数组中有正数有负数，则最大乘积既可能是三个最大正数的乘积，也可能是两个最小负数（即绝对值最大）与最大正数的乘积。
 * 综上，我们在给数组排序后，分别求出三个最大正数的乘积，以及两个最小负数与最大正数的乘积，二者之间的最大值即为所求答案。
 *
 * 复杂度分析
 *
 * 时间复杂度：O(N\log N)O(NlogN)，其中 NN 为数组长度。排序需要 O(N\log N)O(NlogN) 的时间。
 * 空间复杂度：O(\log N)O(logN)，主要为排序的空间开销。
 *
 *
 * @author HL
 * @date 2021/3/10 16:17
 */
public class No6Demo {
    public static int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[len-1],nums[len-3]*nums[len-2]*nums[len-1]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArraysUtils.convertToString(arr);

    }
}
