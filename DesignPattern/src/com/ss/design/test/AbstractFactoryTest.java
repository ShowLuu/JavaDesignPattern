package com.ss.design.test;

import com.ss.design.factory.AkitchenAbstract;
import com.ss.design.inte.KitchenFactory;

/**
 * 抽象工厂模式（父类工厂，工厂的工厂）
 * 
 * 工厂模式与抽象工厂模式区别：
 * 		概念：  1、产品等级结构：抽象类是食物，其子类苹果、牛奶等
 * 			 2、产品族：在抽象工厂模式中，产品族是指由同一个工厂生产的，位于不同产品等级结构中的一组产品。
 * 			         例：Akitchen生产苹果、刀子，其中苹果属于食物产品等级结构中，刀子属于餐具产品等级结构中
 * 				      而Bkitchen生产另一组产品，如牛奶、杯子等
 * 
 * 应用场景：产品分为几个系列，在每个系列中，产品的布局都是类似的，在一个系列中某个位置的产品，在另一个系列中
 * 一定有一个对应的产品。这样的产品结构是存在的，这几个系列中同一位置的产品可能是互斥的，它们是针对不同客户的
 * 解决方案，每个客户都只选择其一。
 * 
 * @author ShowLu
 *
 */
public class AbstractFactoryTest {
	
	public void eat(KitchenFactory k){
		
		System.out.println("A foodaholic is eating "+k.getFood().getFoodName()
				+"whit"+k.getTableWare().getToodName());
		
	}
	
	public static void main(String[] args) {
		
		AbstractFactoryTest fh=new AbstractFactoryTest();
		KitchenFactory kf=new AkitchenAbstract();
		fh.eat(kf);
		
	}

}
