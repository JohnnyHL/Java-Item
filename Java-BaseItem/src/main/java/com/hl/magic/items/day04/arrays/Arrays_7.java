package com.hl.magic.items.day04.arrays;
/**
 * 数组引用变量是访问堆内存中数组元素的根本方式
 * 实际的数组对象被存储在堆(heap)内存中；
 * 如果引用该数组对象的数组引用变量是局部变量，那么它被存储在栈(stack)内存中。
 * 
 * 定义并初始化一个数组后，在内存中分配了两个空间
 * 一个用于存放数组的引用变量，在栈stack内存中；
 * 另一个用于存放实际的数组本身，在堆heap内存中。
 */
public class Arrays_7 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 20;
			System.out.println(arr[i]);
		}
	}
}

