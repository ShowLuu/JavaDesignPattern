package com.ss.design.singleCase;

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
