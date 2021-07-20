package com.hl.magic.items.simple.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 136.只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 */
public class Arrays_Simple_No136 {

    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        //遍历数组，将数组元素如哈希表中，value值记录数组中该存在元素的个数
        for (Integer num : nums) {
            Integer count = hashMap.get(num);
            count = count == null ? 1 : ++count;
            hashMap.put(num,count);
        }
        //取出哈希表中的key
        //根据key取出对应的value，即元素的个数count
        //比较元素个数与num.length/2的大小
        for (Integer key : hashMap.keySet()) {
            Integer count = hashMap.get(key);
            if (count > (nums.length / 2)) {
                return key;
            }
        }
        return -1;// can't find it.
    }

    public int singleNumber1(int[] nums) {
        Arrays.parallelSort(nums);
        return nums[nums.length / 2];
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.parallelSort(nums1);

    }

}
