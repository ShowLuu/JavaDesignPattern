package com.ss.design.singleCase;

/**
 * 双重检验锁
 * 
 * 缺点：解决线程安全的懒汉模式的缺点，但，因为在JV,执行lazyMan=new LazyManDoubleCheck()；方法时
 * JVM为了优化代码，有可能造成做这几件事情的执行顺序不固定，产生错误。
 * 可加volatile关键字解决，其关键字作用：防止编译器自行优化代码。但，此关键字在老版本JDK无法正常工作。
 * 
 * @author ShowLu
 *
 */
public class LazyManDoubleCheck {
	
	private static LazyManDoubleCheck lazyMan;
	
	private volatile static LazyManDoubleCheck lazyManPlus;
	
	public LazyManDoubleCheck() {

	}
	
	public static LazyManDoubleCheck get(){
		if(lazyMan==null){
			synchronized(LazyManDoubleCheck.class){
				if(lazyMan==null){
					lazyMan=new LazyManDoubleCheck();
				}
			}
		}
		return lazyMan;
	}
	
	

}
