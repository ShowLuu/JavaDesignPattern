package com.ss.design.singleCase;

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
