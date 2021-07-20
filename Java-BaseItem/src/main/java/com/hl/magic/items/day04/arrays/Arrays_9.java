package com.hl.magic.items.day04.arrays;
import java.util.Arrays;

/**
 * 数组快排序
 */
public class Arrays_9 {
	public static void main(String[] args) {
		int[] arr = {3,7,2,9,5,6,1,4,8};
		run1(arr);
	}
	public static void run1(int[] arr){
		Arrays.sort(arr);
		System.out.print("[");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i]< arr[i + 1]) {
				System.out.print(arr[i] +",");
			}else {
				System.out.print(arr[i] + "]");
			}
		}
		System.out.print(arr.toString());
	}
}

