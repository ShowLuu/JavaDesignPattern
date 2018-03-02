package com.ss.design.pattern;

import com.ss.design.inte.CnPluginInterface;
import com.ss.design.inte.EnPluginInterface;

//适配器
public class PluginAdapter implements CnPluginInterface {
	
	private EnPluginInterface enPlugin;
	
	public PluginAdapter(EnPluginInterface enPlugin) {
		this.enPlugin=enPlugin;
	}

	//适配器实现了英标的插头，重载国际的充电方法为英标方法
	@Override
	public void chargeWith2Pins() {
		enPlugin.chargeWith3Pins();
	}

}
