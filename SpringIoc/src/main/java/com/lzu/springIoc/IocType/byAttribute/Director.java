package com.lzu.springIoc.IocType.byAttribute;
/**
 * 
* @Title: Director.java
* @Package:com.lzu.springIoc.Test2
* @Description:(导演  相当于容器的作用)
* @author:LJQ
* @date:2019年12月7日
* @version:V1.0
 */
public class Director {
	public static void main(String[] args) {
		LiuDeHua liuDeHua=new LiuDeHua();
		MoAttack m1=new MoAttack();
		m1.setGeLi(liuDeHua);
		m1.cityGateAsk();
	}
}
