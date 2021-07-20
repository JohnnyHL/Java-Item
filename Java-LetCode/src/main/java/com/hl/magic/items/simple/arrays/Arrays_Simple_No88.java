package com.hl.magic.items.simple.arrays;

import java.util.Arrays;

/**
 * 88.合并两个数组
 * 给你两个有序整数数组nms1 和 nums2，请你将 nums2 合并到nums1中，使 nums1 成为一个有序数组。
 * <p>
 * 初始化nums1 和 nums2 的元素数量分别为m 和 n 。你可以假设nums1 的空间大小等于m + n，这样它就有足够的空间保存来自 nums2 的元素。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 示例 2：
 * <p>
 * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
 * 输出：[1]
 *  
 * <p>
 * 提示：
 * <p>
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[i] <= 109
 *
 * @author hl
 * @date 2021/3/8 14:21
 */
public class Arrays_Simple_No88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 9, 5, 0, 5, 5, 5};
        int[] nums2 = {2, 2, 2, 3, 3, 4, 4};
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.parallelSort(nums1);
    }
}
