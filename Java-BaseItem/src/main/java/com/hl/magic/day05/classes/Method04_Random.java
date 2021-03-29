package com.hl.magic.day05.classes;

import java.util.Random;

/**
 * �������������
 *	�洢����Ԫ��
 *	�������飬����ӡ����Ԫ��
 *	���������
 */
public class Method04_Random {
	public static void main(String[] args) {
		//�������飬�洢����
		String[] names = new String[10];
		//������ӷ���
		addStu(names);
		//���ñ������鷽��
		printArrs(names);
		//���������������
		RandomStu(names);
		System.out.println(names);
	}
	
	/*
	 * �������������������������ѧ����
	 */
	public static String RandomStu(String[] names){
		Random random = new Random();
		int index = random.nextInt(names.length);
		return names[index];
	}
	
	/*
	 * ��������
	 */
	public static void printArrs(String[] names){
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
	
	/*
	 * ʵ�������������ѧ������
	 * ����ֵ��void
	 * ����������
	 */
	public static void addStu(String[] names){
		names[0] = "��";
		names[1] = "��";
		names[2] = "��";
		names[3] = "��";
		names[4] = "��";
		names[5] = "��";
		names[6] = "��";
		names[7] = "��";
		names[8] = "��";
		names[9] = "��";
	}
}
