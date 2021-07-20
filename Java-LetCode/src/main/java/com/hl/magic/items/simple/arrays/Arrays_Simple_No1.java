package com.hl.magic.items.simple.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * 两个数之和
 * 给定一个数组nums和目标值target，在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 * 说明： 假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍,可以按任意顺序返回答案。
 * x + y = target
 * <p>
 * 示例1：
 * 输入：nums = [2,7,11,15], target=9
 * 输出：[0,1]
 * <p>
 * 示例1：
 * 输入：nums = [3,3], target=6
 * 输出：[0,1]
 *
 * @author hl
 * @date 2021/3/8 11:22
 */
public class Arrays_Simple_No1 {

    public static void main(String[] args) {
        int[] arrays = {3, 2, 4, 5,3};

//        solution_for(arrays, 6);
        solution_for2(arrays, 6);
//        solution_hashMap(arrays, 6);
    }

    /**
     * 1-暴力枚举法
     * 枚举数组中的每一个数x，然后寻找数组中是否存在target - x；
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution_for(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    System.out.println("[" + i + "," + j + "]");
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 2-哈希Map
     *
     * 时间复杂度：O(1)，N为数组元素的数量，对于每个元素x，可以O(1)地寻找target-x
     * 空间复杂度：O(N)，N为数组元素的数量，主要为哈希表的开销。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution_hashMap(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            //确保存入的元素x不会重复（key唯一），value为元素对应的数组索引下标
            if (hashMap.containsKey(target - x)) {
                System.out.println("[" + (hashMap.get(target - x)) + "," + i + "]");
                return new int[]{hashMap.get(target - x), i};
            }
            //当哈希表中不存在x这个key时，则将其插入到哈希表中
            hashMap.put(x, i);
        }
        return new int[0];
    }

    public static int[] solution_for2(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            int temp1 = nums[i];
            for (int j = 1; j < nums.length; j++) {
                int temp2 = nums[j];
                if(target == (temp1+temp2)){
                    System.out.println("[" + i + "," + j + "]");
//                    return new int[]{i,j};
                }
            }

        }

        return new int[0];
    }
}
