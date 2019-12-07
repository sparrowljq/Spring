package com.lzu.springIoc.Test1;
/**
 * 
* @Title: MoAttack.java
* @Package:com.lzu.springIoc.Test1
* @Description:(剧本墨攻)
* @author:LJQ
* @date:2019年12月7日
* @version:V1.0
 */
public class MoAttack {
	public void cityGateAsk() {
		//引入角色
		GeLi geLi=new Actor1();
		//通过接口展开剧情
		geLi.responseAsk();
	}
}
