package com.ss.design.pattern;

import com.ss.design.inte.CnPluginInterface;
import com.ss.design.inte.EnPluginInterface;

//适配器
public class PluginAdapter implements CnPluginInterface {
	
	private EnPluginInterface enPlugin;
	
	public PluginAdapter(EnPluginInterface enPlugin) {
		this.enPlugin=enPlugin;
	}

	//重zai国际的充电方法wei英标方法
	@Override
	public void chargeWith2Pins() {
		enPlugin.chargeWith3Pins();
	}

}
