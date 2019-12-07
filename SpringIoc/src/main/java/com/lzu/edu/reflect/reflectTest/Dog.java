package com.lzu.edu.reflect.reflectTest;

/**
 * 
 * @Title: Dog.java
 * @Package:com.lzu.edu.reflect.reflectTest
 * @Description:(小狗类)
 * @author:LJQ
 * @date:2019年12月7日
 * @version:V1.0
 */
public class Dog {
	// 体重
	private Double weight;
	// 毛色
	private String color;

	// 默认构造器
	public Dog() {
		super();
	}

	public Dog(Double weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	public void eat() {
		System.out.println(weight + "斤重-" + color + "色-" + "的狗吃肉");
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
