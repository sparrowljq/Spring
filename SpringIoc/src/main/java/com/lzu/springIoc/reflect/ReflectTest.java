package com.lzu.springIoc.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
	public static void main(String[] args) throws Exception {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("com.lzu.springIoc.reflect.Apple");
		Apple app1 = (Apple) clazz.newInstance();
		Field colorfield = clazz.getDeclaredField("color");
		//取消Java语言访问检查以访问private
		colorfield.setAccessible(true);
		colorfield.set(app1, "红色");
		
		Method method1 = clazz.getDeclaredMethod("getUp", ((Class[])null));
		method1.setAccessible(true);
		method1.invoke(app1, ((Object[])null));
	}
}
