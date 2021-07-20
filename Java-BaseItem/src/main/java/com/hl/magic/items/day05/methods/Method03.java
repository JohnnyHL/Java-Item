package com.hl.magic.items.day05.methods;
/**
 * ���������еĲ����������� 
 *	1.�����в����ǻ�����������
 *	2.�����в�����������������
 */
public class Method03 {
	public static void main(String[] args) {
		/*
		 1.�����в����ǻ�����������
		int a=1;
		int b=2;
		change(a, b);//����ֵ����
		System.out.println(a);//a=1
		System.out.println(b);//b=2
		*/
		/*2.�����в�����������������
		 * 
		 */
		int[] arr = {1,2,3,4};
		System.out.println(arr[2]);//arr[2]=3
		
		change(arr);//arr���õ�ַ���ݳ������÷����б����Ϊ100�����������꣬������ջ����
		System.out.println(arr[2]);//arr[2]=100
	}
	
	//���������ú󣬽���ջ��������ʱarr[2]�ڶ��ڴ��еĵ�ֵַΪ100����˴�ӡ���Ľ��Ϊ100
	public static void change(int[] arr) {
		arr[2]=100;
	}
	
	
	//change(a,b)����ִ����ͳ�ջ����GC����
	//��ʱ�޷���ֵ�������main�����е��ø÷���ʱ��������ֵ��û�б仯��
	//���ǣ�change�����з���ֵ����main�����У��������ķ���ֵ��ֵ������
	//��ʱ���ɿ�����ӡ��������ݷ����仯
	public static void change(int a,int b){
		a = a + b;
		b = b + a;
	}
}
