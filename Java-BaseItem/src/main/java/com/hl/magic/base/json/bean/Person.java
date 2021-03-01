package com.hl.magic.base.json.bean;

import java.util.Arrays;
/**
 * java bean
 * @author hl
 */
public class Person {
	private String name;
	private double age;
	private String school;
	private Object car;
	private Object hourse;
	private String[] major;
	private String birthday;
	private boolean has_friend;
	private String commont;
	private int status;

	public Person() {
		
	}

	public Person(String name, double age, String school, Object car,
			Object hourse, String[] major, String birthday, boolean hasFriend,
			String commont, int status) {
		this.name = name;
		this.age = age;
		this.school = school;
		this.car = car;
		this.hourse = hourse;
		this.major = major;
		this.birthday = birthday;
		has_friend = hasFriend;
		this.commont = commont;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Object getCar() {
		return car;
	}

	public void setCar(Object car) {
		this.car = car;
	}

	public Object getHourse() {
		return hourse;
	}

	public void setHourse(Object hourse) {
		this.hourse = hourse;
	}

	public String[] getMajor() {
		return major;
	}

	public void setMajor(String[] major) {
		this.major = major;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public boolean isHas_friend() {
		return has_friend;
	}

	public void setHas_friend(boolean hasFriend) {
		has_friend = hasFriend;
	}

	public String getCommont() {
		return commont;
	}

	public void setCommont(String commont) {
		this.commont = commont;
	}

	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", birthday=" + birthday + ", car=" + car
				+ ", commont=" + commont + ", has_friend=" + has_friend
				+ ", hourse=" + hourse + ", major=" + Arrays.toString(major)
				+ ", name=" + name + ", school=" + school + ", status="
				+ status + "]";
	}
}
