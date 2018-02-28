package com.ss.design.test;

import com.ss.design.factory.AkitchenAbstract;
import com.ss.design.inte.KitchenFactory;

public class FoodaholicAbstract {
	
	public void eat(KitchenFactory k){
		
		System.out.println("A foodaholic is eating "+k.getFood().getFoodName()
				+"whit"+k.getTableWare().getToodName());
		
	}
	
	public static void main(String[] args) {
		
		FoodaholicAbstract fh=new FoodaholicAbstract();
		KitchenFactory kf=new AkitchenAbstract();
		fh.eat(kf);
		
	}

}
