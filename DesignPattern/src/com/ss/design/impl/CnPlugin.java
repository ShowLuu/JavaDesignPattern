package com.ss.design.impl;

import com.ss.design.inte.CnPluginInterface;

//实现国际插座的充电方法
public class CnPlugin implements CnPluginInterface {

	@Override
	public void chargeWith2Pins() {
		System.out.println("charge with CnPlugin");
	}

}
