package com.hl.magic.base.oop.character04;

import org.junit.Test;

import java.util.Date;

/**
 * @author hl
 * @date 2020/9/4 15:05
 */
public class DemoTest {

    @Test
    public void test_case1() {
        Employees employees = new Employees();
        employees.setName("小明");
        employees.setSalary(10000000000.00);
        employees.setHireDay(new Date());

        System.out.println("=====>" + employees);

        //employees.getSalaryOK1();
        employees.getSalaryOK2();
        employees.getSalaryOK3();
    }
}