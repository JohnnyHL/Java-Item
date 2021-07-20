package com.hl.magic.items.day04.arrays;
/**
 * 
 * @author Administrator
 *
 * 计算数组的最大值
 *	1.定义变量，保存数组中0索引上的元素值arr[0];
 *		int max = arr[0];
 *
 *	2.max和数组中的其它元素进行比较
 *		A.for循环对数组遍历
 *		B.max与其他索引上的元素进行比较判断
 *			max记录下较大的数
 *
 *	3.数组遍历完成后
 *		max记录的就是数组的最大值
 */
public class Arrays_5MaxNum {
	public static void main(String[] args) {
		int[] arr = {56,12,3,44,35,6,17,28,79};
		int max = arr[0];
		
		//for遍历数组，获取所有的元素，和变量max比较
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {	//变量max和数组中的每个元素进行比较
				max = arr[i];	//如果max小于数组中的一个元素，将较大的数组元素赋值给max
			}
		}
		//遍历完成后，max中存储的即最大值
		System.out.println(max);
	}
}

