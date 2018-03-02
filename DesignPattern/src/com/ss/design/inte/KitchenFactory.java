package com.ss.design.inte;

import com.ss.design.impl.Knife;

//抽象工厂
public interface KitchenFactory {
	
	Food getFood();
	
	Knife getTableWare();

}
