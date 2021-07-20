package com.hl.magic.items.day04.arrays;

import com.hl.magic.items.utils.PrintArrayUtils;

import java.util.Arrays;


/**
 *	数组容器
 *
 * 数组是一个容器：存储到数组中的每一个元素，都有自己的编号
 * 		均存在堆内存中，JVM在堆内存开空间，存放数组容器。
 *
 * 		数组静态初始化时，由于元素赋值已固定，其数组长度固定不能改变
 *
 * 		访问数组元素，依赖于数组的索引，index
 *
 * 		数组的属性用于操作索引：数组的长度，属性的名字 length
 * 		使用属性：数组名.length
 * 			数组的最小长度是0，最大索引值--> 数组长度(数组.lengrh) -1
 * 			数组长度：元素个数
 * 			数组索引值：元素个数值 - 1
 */
public class Arrays_1 {

	public Arrays_1() {
		
	}

	public static void main(String[] args) {
		// 定义数组，存储证书，容器长度
		// 数据类型[] 变量名 = new 数据类型[存储元素的个数]
		int[] arr = new int[]{1,3,2,4,9,6,7,8,5};
		int sum = 0;
		Arrays.sort(arr);
		//遍历数组
		PrintArrayUtils.printArray(arr);
		for (int i = 0; i < arr.length; i++) {
			sum +=i;
		}
		System.out.print(sum);
	}
}
