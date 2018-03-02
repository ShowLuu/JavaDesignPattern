package com.ss.desgin.ext;

import com.ss.design.abs.Girl;
import com.ss.design.abs.GirlDecorator;

//装饰  加上金发
public class GoldenHair extends GirlDecorator {
	
	private Girl girl;
	
	public GoldenHair(Girl g){
		this.girl=g;
	}
	
	public String getDescription(){
		return girl.getDescription()+"with golden hair";
	}

}
