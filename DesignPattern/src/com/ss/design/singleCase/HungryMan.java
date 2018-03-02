package com.ss.design.singleCase;

/**
 * 饿汉模式
 *  
 * 缺点：不管有没有调用过该类的方法，都会新建一个实例，浪费系统资源
 * 
 * @author ShowLu
 *
 */
public class HungryMan {
	
	private static final HungryMan h=new HungryMan();
	
	public HungryMan() {

	}
	
	public static HungryMan get(){
		return h;
	}

}
