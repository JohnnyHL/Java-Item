package com.hl.magic.items.day04.arrays;
/**
 * 数组引用变量是访问堆内存中数组元素的根本方式
 * 实际的数组对象被存储在堆(heap)内存中；
 * 如果引用该数组对象的数组引用变量是局部变量，那么它被存储在栈(stack)内存中。
 * 
 * 定义并初始化一个数组后，在内存中分配了两个空间
 * 一个用于存放数组的引用变量，在栈stack内存中；
 * 另一个用于存放实际的数组本身，在堆heap内存中。
 * 
 * 数组的选择排序
 * 
 */
public class Arrays_6 {
	public static void main(String[] args) {
		int[] arr = {3,2,6,1};
		//调用选择排序方法
		selectSort(arr);
		//调用数组遍历
		printArr(arr);
	}
	
	//数组的选择排序
	public static void selectSort(int[] arr){
		//嵌套循环，比较数组元素
		//外层循环，控制循环的圈数
		for (int i = 0; i < arr.length - 1; i++) {
			//内层循环，控制每圈循环时的，各元素比较的次数
			for (int j = i + 1; j < arr.length; j++) {
				//判断比较结果，互换位置
				if (arr[i] > arr[j]) {
					//采用第三方变量，临时存储数组元素
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//数组遍历，标准格式输出
	public static void printArr(int[] arr){
		//输出数组的左半边"["
		System.out.print("[");
		//遍历数组
		for (int i = 0; i < arr.length; i++) {
			//判断如果是数组的最后一个元素
			if (i == arr.length-1) {
				//输出该元素和右半边"]"
				System.out.print(arr[i] + "]");
			}else {
				//否则输出该元素和逗号
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
	}
}
