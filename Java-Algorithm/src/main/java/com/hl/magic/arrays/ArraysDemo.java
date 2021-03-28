package com.hl.magic.arrays;

/**
 * 数组的基本操作测试类
 *
 * @author HL
 * @date 2021/3/16 16:19
 */
public class ArraysDemo {

    private int[] array;
    private int size;

    public ArraysDemo(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }
    /**
     * 插入数组元素
     */
    public void intsert(int index, int element){
        if(index <0 || index>size){
            throw new IndexOutOfBoundsException("索引越界");
        }
        for (int i = size-1; i >= index ; i--) {
            array[i+1] = array[i];
        }
        array[index] = element;
        size++;
    }

    public void resize(){
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array,0,newArray,0,array.length);
        array = newArray;
    }
    /**
     * 输出数组
     */
    public void outPut(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        ArraysDemo demo = new ArraysDemo(10);
        demo.intsert(0,3);
        demo.intsert(1,7);
        demo.intsert(2,9);
        demo.outPut();
    }
}
