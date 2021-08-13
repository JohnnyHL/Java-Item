package com.hl.magic.items.day08.generics;

/**
 * 泛型类
 * 常用的通配符为： T，E，K，V，？
 * ?:表示不确定的Java类型
 * T(type):表示一个具体的Java类型
 * E(element):表示元素
 * K V(key value):分别表示Java键值中的key value
 *
 * @Author HL
 * @Date 2021/8/12 9:30
 */
public class GenericsDemo01<T> {

    private T key;

    public GenericsDemo01(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
