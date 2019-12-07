package com.lzu.edu.springIoc.LoaderTest;

public class ClassLoaderTest {
	public static void main(String[] args) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		System.out.println("current:" + loader);
		System.out.println("parent:" + loader.getParent());
		System.out.println("grandparent:" + loader.getParent().getParent());
		/*
		 * 输出结果 current:jdk.internal.loader.ClassLoaders$AppClassLoader@15db9742
		 * parent:jdk.internal.loader.ClassLoaders$PlatformClassLoader@279f2327
		 * grandparent:null
		 */
	}
}
