package com.ss.design.factory;

import com.ss.design.impl.Apple;
import com.ss.design.impl.Knife;
import com.ss.design.inte.Food;
import com.ss.design.inte.KitchenFactory;
import com.ss.design.inte.TableWare;

public class AkitchenAbstract implements KitchenFactory{

	@Override
	public Food getFood() {
		return new Apple();
	}

	@Override
	public TableWare getTableWare() {
		return new Knife();
	}

}
