package com.hl.magic.items.utils;
/**
 * 遍历数组的工具类，输出标准格式数组。
 *
 */
public class PrintArrayUtils {
	public static void printArray(int[] arr){
		//输出一半中括号，不换行打印
		System.out.print("[");
		//数组进行遍历，（单层循环遍历即可，无需嵌套）
		for (int i = 0; i < arr.length; i++) {
			//判断遍历到的元素，是不是数组的最后一个元素
			//如何判断循环变量到达length -1
			if (i ==arr.length -1) {
				//输出数组的元素和
				System.out.print(arr[i] + "]");
			}else {
				//不是数组的最后一个元素，输出数组元素和逗号
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	}
}