package com.hl.magic.base.oop.character03;

/**
 * @author Administrator
 */
public class Student extends Person {

    private String school;

    public Student(String name, int age) {
        super(name, age);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
