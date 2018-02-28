package com.ss.design.factory;

import com.ss.design.impl.Female;
import com.ss.design.impl.Male;
import com.ss.design.inte.Human;

public class HumanFactory {
	
	//普通工厂方法模式
	public Human createHuman(String gender){
		if(gender.equals("male")){
			return new Male();
		}else if(gender.equals("Female")){
			return new Female();
		}else{
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
	
	
	//多个工厂方法模式
	public Male createMale(){
		return new Male();
	}
	
	public Female createFemale(){
		return new Female();
	}
	
	
	//静态工厂方法模式
	public static Male createMales(){
		return new Male();
	}
	
	public static Female createFemales(){
		return new Female();
	}
	
}
