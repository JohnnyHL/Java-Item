package com.hl.magic.items.day05.methods;

import java.util.Scanner;

/**
 * ��������
 *	��������û��˳��ĸ���
 */
public class Method02 {
	//������ڵ�
	public static void main(String[] args) {
		Method02 method02 = new Method02();
		
//		method02.printRect();//��������
		
//		int number = method02.getNumber();
//		System.out.println(number);	
		
//		printRect2(3,5);
		int num = getAvg(1, 2, 3);
		System.out.println(num);
	}
	
	/*
	 * �����з���ֵ�в�����������������ƽ��ֵ
	 */
	public static int getAvg(int a,int b,int c){
		//��������
		
		return (a+b+c)/2;
	}
	
	/*
	 * �����޷���ֵ�в�������
	 */
	public static void printRect2(int m,int n){
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	/*
	 * �����з���ֵ�в�������
	 * ��ȷû��δ֪��
	 */
	
	public static int getNumber(){
		//��������
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}
	
	/*
	 * �����޷���ֵ�޲�������
	 * ������������Ҫ���������
	 * ��ȷδ֪��������Ҫδ֪��
	 */
	public static void printRect(){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
