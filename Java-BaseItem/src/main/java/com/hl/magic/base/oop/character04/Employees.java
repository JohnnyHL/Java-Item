package com.hl.magic.base.oop.character04;

import java.util.Date;

/**
 * 雇员类
 *
 * @author hl
 * @date 2020/9/4 14:53
 */
public class Employees {

    private String name;
    private double salary;
    private Date hireDay;

    public Employees() {
    }

    public Employees(String name, double salary, Date hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }


    private String getSalaryOK1(){
        return "private权限修饰的方法，只能当前类使用";
    }

    protected String getSalaryOK2(){
        return "protected权限修饰的方法，只能当前类或相同包下的类使用";
    }

    public String getSalaryOK3(){
        return "public权限修饰的方法，当前类或不同包下的类都能使用";
    }
}
