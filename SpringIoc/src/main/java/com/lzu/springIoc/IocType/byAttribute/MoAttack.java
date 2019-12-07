package com.lzu.springIoc.IocType.byAttribute;
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
	public void cityGateAsk() {
		geLi.responseAsk();
	}
	public GeLi getGeLi() {
		return geLi;
	}
	public void setGeLi(GeLi geLi) {
		this.geLi = geLi;
	}
	
}
