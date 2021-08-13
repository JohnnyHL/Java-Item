package com.hl.magic.items.day09.oop.character05;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author hl
 * @date 2020/9/17 14:47
 */
public class DemoTest {

    @Test
    public void case1() {
        Person1 person11 = new Person1("001", "小明");
    }

    @Test
    public void case2() {
        try {
            Person1 person1 = Person1.class.newInstance();
            System.out.println(person1.getId() + " , " + person1.getName());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void case3() throws Exception {
        Constructor<?>[] declaredConstructors = Person1.class.getDeclaredConstructors();
        Constructor<?>[] constructors = Person1.class.getConstructors();


        Constructor<?> noArgsConstructor = declaredConstructors[0];
        Constructor<?> haveArgsConstructor = declaredConstructors[1];

        noArgsConstructor.setAccessible(true);
        Object person1 = noArgsConstructor.newInstance();
        Object person2 = declaredConstructors[1].newInstance("002", "校长");

        System.out.println(person1);
        System.out.println(person2);
    }

    @Test
    public void case4() {
        Person1 person11 = new Person1("001", "小明");
    }
}
