package com.ss.design.impl;

import com.ss.design.inte.EnPluginInterface;

//实现英标插座的充电方法
public class EnPlugin implements EnPluginInterface {

	@Override
	public void chargeWith3Pins() {
		System.out.println("charge with EnPlugin");
	}

}
