package com.ss.design.impl;

import com.ss.design.inte.Food;

//具体食物Apple
public class Apple implements Food {

	@Override
	public String getFoodName() {
		return "apple";
	}

}
