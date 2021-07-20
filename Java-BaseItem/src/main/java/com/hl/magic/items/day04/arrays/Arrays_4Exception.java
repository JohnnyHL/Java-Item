package com.hl.magic.items.day04.arrays;
/**
 * @author Administrator
 *数组的异常：
 *【1】数组的索引越界异常
 *		java.lang.ArrayIndexOutOfBoundsException: 8
 *
 *【2】空指针异常
 *		java.lang.NullPointerException:     
 */
public class Arrays_4Exception {
	public static void main(String[] args) {
		int[] arr = {5,4,2,2,2,1};
//		System.out.println(arr[8]);//java.lang.ArrayIndexOutOfBoundsException: 8              数组越界异常
		System.out.println(arr.length);
	}
}
