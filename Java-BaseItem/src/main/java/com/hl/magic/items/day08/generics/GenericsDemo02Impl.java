package com.hl.magic.items.day08.generics;

/**
 * 实现泛型接口，指定类型：String
 *
 * @Author HL
 * @Date 2021/8/12 9:33
 */
public class GenericsDemo02Impl<String> implements GenericsDemo02<String> {

    @Override
    public String methods() {
        return (String) "hello";
    }

    public static <E> void printArray(E[] inputArray){
        for (E element : inputArray) {
            System.out.println("===>" + element);
        }
    }
}
