package com.hl.magic.items.day04.arrays;
/**
 * 
 */
public class Arrays_8 {
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
