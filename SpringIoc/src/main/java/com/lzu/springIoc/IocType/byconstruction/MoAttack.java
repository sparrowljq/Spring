package com.lzu.springIoc.IocType.byconstruction;
/**
 * 
* @Title: MoAttack.java
* @Package:com.lzu.springIoc.Test2
* @Description:(墨攻剧本)
* @author:LJQ
* @date:2019年12月7日
* @version:V1.0
 */
public class MoAttack {
	//剧本中添加geli角色
	private GeLi geLi;
	
	public MoAttack(GeLi geLi) {//注入角色的构造函数
		super();
		this.geLi = geLi;
	}

	public void cityGateAsk() {
		geLi.responseAsk();
	}
	
	
}
