package com.ss.design.singleCase;

public class Man {
	
	private static class ManHolder{
		private static final Man man=new Man();
	}
	
	private Man(){}
	
	public static Man get(){
		return ManHolder.man;
	}

}
