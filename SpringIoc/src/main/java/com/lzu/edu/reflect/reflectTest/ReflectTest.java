package com.lzu.edu.reflect.reflectTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.naming.Context;

/**
 * 
 * @Title: ReflectTest.java
 * @Package:com.lzu.edu.reflect.reflectTest
 * @Description:(反射测试类)
 * @author:LJQ
 * @date:2019年12月7日
 * @version:V1.0
 */
public class ReflectTest {
	// 初始化类
	public static Dog initeDog() throws Exception {
		// 获取类加载器
		ClassLoader loder = Thread.currentThread().getContextClassLoader();
		// 加载Dog对象
		Class clazz = loder.loadClass("com.lzu.edu.reflect.reflectTest.Dog");
		// 获取默认构造器 通过默认构造器获取类实例
		Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
		Dog dog = (Dog) cons.newInstance();
		Method setWeight = clazz.getMethod("setWeight", Double.class);
		setWeight.invoke(dog, 3.0);
		Method setcolor = clazz.getMethod("setColor", String.class);
		setcolor.invoke(dog, "black and white");
		return dog;

	}

	public static void main(String[] args) throws Exception {
		Dog dog = initeDog();
		dog.eat();
	}
}
