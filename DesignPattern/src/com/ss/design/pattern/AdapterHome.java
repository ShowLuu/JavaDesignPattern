package com.ss.design.pattern;

import com.ss.design.inte.CnPluginInterface;
import com.ss.design.inte.EnPluginInterface;

//在国家内充电s
public class AdapterHome {
	
	private CnPluginInterface cnPlugin;

	public CnPluginInterface getCnPlugin() {
		return cnPlugin;
	}

	public void setCnPlugin(CnPluginInterface cnPlugin) {
		this.cnPlugin = cnPlugin;
	}
	
	public AdapterHome(){}
	
	public AdapterHome(CnPluginInterface cnPlugin){
		this.cnPlugin=cnPlugin;
	}
	
	//充电
	public void charge(){
		//国际充电
		cnPlugin.chargeWith2Pins();
	}

}
