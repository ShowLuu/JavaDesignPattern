package com.ss.desgin.ext;

import com.ss.design.abs.Girl;
import com.ss.design.abs.GirlDecorator;

//装饰  加上身材高大的特性
public class Tall extends GirlDecorator {

	private Girl girl;
	
	public Tall(Girl g){
		this.girl=g;
	}
	
	@Override
	public String getDescription() {
		return girl.getDescription()+"is very tall";
	}

}
