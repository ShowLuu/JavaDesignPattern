package com.ss.design.singleCase;

public class HungryMan {
	
	private static final HungryMan h=new HungryMan();
	
	public HungryMan() {

	}
	
	public static HungryMan get(){
		return h;
	}

}
