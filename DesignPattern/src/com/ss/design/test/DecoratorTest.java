package com.ss.design.test;

import com.ss.desgin.ext.AmericanGirl;
import com.ss.desgin.ext.GoldenHair;
import com.ss.desgin.ext.Tall;
import com.ss.design.abs.Girl;

/**
 * 装饰者模式，即动态地把职责附加到已有对象上去，实现功能扩展。
 * 
 * 应用场景：当需要动态地给一个对象添加功能，实现功能扩展的时候，就可以使用装饰者模式。
 * 		      例：Java IO类中 BufferedReader装饰了InputStreamReader
 * 			  BufferedReader input=new BufferedReader(new InputStreamReader());
 * 
 * @author ShowLu
 *
 */
public class DecoratorTest {
	
	public static void main(String[] args) {
		
		Girl g1=new AmericanGirl();	
		System.out.println(g1.getDescription());
		
		Girl g2=new GoldenHair(g1);	
		System.out.println(g2.getDescription());
		
		Girl g3=new Tall(g2);
		System.out.println(g3.getDescription());
		
	}

}
