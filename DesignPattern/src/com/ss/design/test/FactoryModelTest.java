package com.ss.design.test;

import com.ss.design.factory.HumanFactory;
import com.ss.design.inte.Human;

/**
 * 工厂模式【普通工厂模式、多个工厂方法模式、静态工厂方法模式】
 * 在面向对象程序设计中，工厂通常是一个用来创建其他对象的对象，即根据参数不同->不同的分配方案->创建相应的对象
 * 通过使用一个公共接口来指向新创建的对象，目的是：在创建对象是不会对客户端暴露创建逻辑。
 * 应用场景：出现了大量的产品需要创建，并且具有公共的接口时。
 * @author ShowLu
 * 
 */
public class FactoryModelTest {
	
	public static void main(String[] args) {
		
//		普通工厂方法模式
//		HumanFactory factory=new HumanFactory();
//		Human human=factory.createHuman("male");
		
//		多个工厂方法模式
//		HumanFactory factory=new HumanFactory();
//		Human human=factory.createMale();
		
		//静态工厂方法模式
		Human human=HumanFactory.createFemales();
		
		human.eat();
		human.sleep();
		human.beat();
		
	}

}
