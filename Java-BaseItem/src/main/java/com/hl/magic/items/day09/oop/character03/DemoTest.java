package com.hl.magic.items.day09.oop.character03;

import org.junit.Test;

/**
 * @author Administrator
 */
public class DemoTest {

    @Test
    public void test_Case1() {
        Student student = new Student("jack", 18);
        System.out.println(student.getSchool() + "," + student.getName() + "," + student.getAge() + "岁");
    }
}