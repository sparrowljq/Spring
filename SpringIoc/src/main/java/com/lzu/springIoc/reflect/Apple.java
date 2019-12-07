package com.lzu.springIoc.reflect;

public class Apple {
	private Double weight;
	private String color;
	public Apple() {

	}
	public Apple(Double weight, String color) {
		this.weight = weight;
		this.color = color;
	}
	public void getUp() {
		System.out.println("慢慢长大");
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
