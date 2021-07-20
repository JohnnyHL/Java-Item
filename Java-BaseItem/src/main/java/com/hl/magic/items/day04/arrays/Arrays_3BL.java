package com.hl.magic.items.day04.arrays;
/**
 *数组遍历：通过索引的方式，将数组中的每个元素分别获取出来.
 * 	  索引：从0开始，自动增长至数组的长度length-1,时不再增长
 *	
 *
 *	for循环----->已知循环次数的		计数器思想
 *	while循环--->不确定循环次数的
 * 
 * 
 * 
 */
public class Arrays_3BL {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9,5,3,4,6,5,2,1};
		System.out.println("数组长度是："+arr.length);
		
		int[] b = new int[4];
		System.out.println("b数组的长度："+b.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+",索引值：" + i);
		}
	}
}
