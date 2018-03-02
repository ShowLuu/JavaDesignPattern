package com.ss.design.test;

import com.ss.design.impl.CnPlugin;
import com.ss.design.impl.EnPlugin;
import com.ss.design.inte.CnPluginInterface;
import com.ss.design.inte.EnPluginInterface;
import com.ss.design.pattern.AdapterHome;
import com.ss.design.pattern.PluginAdapter;

/**
 * 适配器模式
 * 应用场景：当想使用一个已有的类，但这个类的接口跟你的又不一样，不能直接拿来用
 * 适配器的作用：在旧的接口与新的接口之间完成适配
 * 适配器类设计过程：1、适配器对象实现原有接口
 * 				2、适配器对象组合一个实现新的接口的对象（这个对象也可以不实现一个接口，只是一个单纯的对象）
 *				3、对适配器原有接口方法的调用被委托给新接口的实例的特定方法
 * 
 * @author ShowLu
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		
		//国际插头测试
		CnPluginInterface cnPlugin=new CnPlugin();
		AdapterHome home=new AdapterHome(cnPlugin);
		home.charge();
		
		//适配器测试
		EnPluginInterface enPlugin=new EnPlugin();
		AdapterHome home2=new AdapterHome();
		//适配器（1、2）
		PluginAdapter pluginAdapter=new PluginAdapter(enPlugin);
		//3、
		home2.setCnPlugin(pluginAdapter);
		home2.charge();
		
	}
	
}
