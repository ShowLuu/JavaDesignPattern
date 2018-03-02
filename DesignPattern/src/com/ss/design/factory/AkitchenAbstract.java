package com.ss.design.factory;

import com.ss.design.impl.Apple;
import com.ss.design.impl.Knife;
import com.ss.design.inte.Food;
import com.ss.design.inte.KitchenFactory;

public class AkitchenAbstract implements KitchenFactory{

	@Override
	public Food getFood() {
		return new Apple();
	}

	@Override
	public Knife getTableWare() {
		return new Knife();
	}

}
