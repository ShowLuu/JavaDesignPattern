package com.ss.design.test;

import com.ss.desgin.ext.AmericanGirl;
import com.ss.desgin.ext.GoldenHair;
import com.ss.desgin.ext.Tall;
import com.ss.design.abs.Girl;

public class DecoratorTest {
	
	public static void main(String[] args) {
		
		Girl g1=new AmericanGirl();	
		System.out.println(g1.getDescription());
		
		Girl g2=new GoldenHair(g1);	
		System.out.println(g2.getDescription());
		
		Tall g3=new Tall(g2);
		System.out.println(g3.getDescription());
	}

}
