package com.hl.magic.items.day11.collection;

/**
 * 测试类，无实际意义
 *
 * @author hl
 */
public class Person11 {

    private String id;

    private String name;

    private int age;

    public Person11() {

    }

    public Person11(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person11(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
