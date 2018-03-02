package com.ss.design.singleCase;

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
