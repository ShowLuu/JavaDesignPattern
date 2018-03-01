package com.ss.design.test;

import com.ss.design.impl.CnPlugin;
import com.ss.design.impl.EnPlugin;
import com.ss.design.inte.CnPluginInterface;
import com.ss.design.inte.EnPluginInterface;
import com.ss.design.pattern.AdapterHome;
import com.ss.design.pattern.PluginAdapter;

//适配器测试类
public class AdapterTest {

	public static void main(String[] args) {
		
		//国际插头测试
//		CnPluginInterface cnPlugin=new CnPlugin();
//		AdapterHome home=new AdapterHome(cnPlugin);
//		home.charge();
		
		//适配器测试
		EnPluginInterface enPlugin=new EnPlugin();
		AdapterHome home=new AdapterHome();
		PluginAdapter pluginAdapter=new PluginAdapter(enPlugin);
		home.setCnPlugin(pluginAdapter);
		home.charge();
		
		
	}
	
}
