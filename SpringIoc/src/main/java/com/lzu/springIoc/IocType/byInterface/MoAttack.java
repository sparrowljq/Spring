package com.lzu.springIoc.IocType.byInterface;

/**
 * 
 * @Title: MoAttack.java
 * @Package:com.lzu.springIoc.Test2
 * @Description:(墨攻剧本)
 * @author:LJQ
 * @date:2019年12月7日
 * @version:V1.0
 */
public class MoAttack implements ActorInject {
	// 剧本中添加geli角色
	private GeLi geLi;

	public void cityGateAsk() {
		geLi.responseAsk();
	}

	// 接口注入geli饰演者
	public void addActor(GeLi geLi) {
		this.geLi = geLi;
	}

}
