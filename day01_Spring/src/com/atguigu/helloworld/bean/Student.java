package com.atguigu.helloworld.bean;

public class Student {
	Integer stuId;
	String stuName;
	int age;
	
	public Student() {
		System.out.println("初始化构造方法");
		// TODO Auto-generated constructor stub
	}

	public Student(Integer stuId, String stuName, int age) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.age = age;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
/*
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", age=" + age + "]";
	}*/
	
	
	
}
