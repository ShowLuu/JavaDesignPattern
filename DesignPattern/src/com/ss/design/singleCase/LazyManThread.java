package com.ss.design.singleCase;

/**
 * 线程安全的懒汉模式
 * 
 * 特点：即使多线程调用，也只会新建一个实例
 * 缺点：效率不高，每次调用获得实例方法时都要进行同步，但是多数情况下并不需要同步操作，所以只需要在第一次
 * 新建实例的时候，使用同步方法
 * 
 * @author ShowLu
 *
 */
public class LazyManThread {
	
	private static LazyManThread lazyMan;
	
	public LazyManThread() {

	}
	
	public static synchronized LazyManThread get(){
		if(lazyMan==null){
			lazyMan=new LazyManThread();
		}
		return lazyMan;
	}

}
