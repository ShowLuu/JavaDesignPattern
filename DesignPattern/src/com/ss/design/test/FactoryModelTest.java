package com.ss.design.test;

import com.ss.design.factory.HumanFactory;
import com.ss.design.inte.Human;

public class FactoryModelTest {
	
	public static void main(String[] args) {
		
		//普通工厂方法模式
//		HumanFactory factory=new HumanFactory();
//		Human human=factory.createHuman("male");
		
		//多个工厂方法模式
//		HumanFactory factory=new HumanFactory();
//		Human human=factory.createMale();
		
		//静态工厂方法模式
		Human human=HumanFactory.createFemales();
		
		human.eat();
		human.sleep();
		human.beat();
		
	}

}
