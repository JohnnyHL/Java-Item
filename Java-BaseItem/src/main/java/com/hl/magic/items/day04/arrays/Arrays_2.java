package com.hl.magic.items.day04.arrays;
/**
 *	数组的初始化
 *	为数组的元素分配内存空间，并未每个数组元素赋初始值。
 *
 *	数组的静态初始化：
 *				显式指定数组的元素初始值，数组长度由系统来指定
 *				数据类型[] 变量名 = new 数组类型[]{元素1,元素2,....,元素n}; 
 * 			或：
 * 				数据类型[] 变量名= {元素1,元素2,....,元素n};			
 * 					
 * 				arrayName = new type[]{};
 * 	数组的动态初始化：
 * 				显式指定数组的长度，不对数组进行赋初值，由系统对数组进行初始化
 * 				数组类型[] 变量名 = new 数组类型[元素个数];
 * 				元素个数即数组的长度
 * 
 */
public class Arrays_2 {
	public static void main(String[] args) {
		//数组的静态初始化		
		int[] arr = new int[]{1,2,3,4,5};
		System.out.println("静态初始化的数组长度为：" + arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}
