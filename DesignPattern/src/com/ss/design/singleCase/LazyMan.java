package com.ss.design.singleCase;

/**
 * 懒汉模式
 * 
 * 特点：被调用时，先判断是否为null，如果是null才新建实例
 * 缺点：如果有多个线程并行调用方法时，还是会创建多个实例，浪费系统资源
 * 
 * @author ShowLu
 *
 */
public class LazyMan {
	
	private static LazyMan lazyMan;
	
	public LazyMan() {

	}
	
	public static LazyMan get(){
		if(lazyMan==null){
			lazyMan=new LazyMan();
		}
		return lazyMan;
	}

}
