package com.hl.magic.items.day01.basecode.objects;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class Person01 implements Cloneable,Serializable {

    private String name;
    private int age;

    public Person01() {
    }

    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("I'm eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Person01 clone() throws CloneNotSupportedException {
        return (Person01) super.clone();

    }

    /**
     * 重写父类equals方法
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(this ==obj){
            return true;
        }
        if(null ==obj){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        if(this ==obj){
            return true;
        }
        return super.equals(obj);
    }
}
