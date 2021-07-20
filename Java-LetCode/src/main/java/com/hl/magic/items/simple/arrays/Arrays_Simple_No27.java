package com.hl.magic.items.simple.arrays;

/**
 * 27.移除元素
 *
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 *
 * @author HL
 * @date 2021/3/17 20:07
 */
public class Arrays_Simple_No27 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4};
        int val = 3;
        int len = removeElement(nums, val);
        System.out.println("新数组的长度：" + len);
    }

    public static int removeElement(int[] nums, int val) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[temp] = nums[i];
                temp ++;
            }
        }
        return temp;
    }
}
