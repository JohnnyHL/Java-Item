package com.hl.magic.items.day04.arrays;

import java.util.Random;
import java.util.Scanner;

public class P1_1 {
	static int N = 20;
	public static void main(String[] args) {
		int[] arr = new int[N];
		int x,i;
		int f = -1;
		
		Random r = new Random();			//创建随机数Random随机
		for (i = 0; i < N; i++) {
			arr[i] = r.nextInt(100);		//随机选择100以内的整数
		}
		System.out.print("生成随机数");
		
		for (i = 0; i < N; i++) {		
			System.out.print(arr[i] + " ");	//输出随机序列
		}
		System.out.println("\n\n");
		
		System.out.print("请输入要查找的数");
		
		Scanner sc = new Scanner(System.in);	//键盘输入
		x = sc.nextInt();			//输入要查找的数
		for (i = 0; i < N; i++) {	//顺序查找
			if (x == arr[i]) {		//找到数据
				f = i;
				System.out.print("数据：" + x + "位于数组的第" + (f+1) + "个元素处.\n");
				//break;
			}
			if (x != arr[i]) { // 输出查找的结果
				System.out.print("没有找到数据：" + x);
				break;
			}
		}
	}
}
