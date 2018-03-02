package com.ss.design.singleCase;

/**
 * 单例模式，即被单例的对象只能有一个实例存在。
 * 		      实现方式：一个类能返回对象的一个引用和一个获得唯一实例的方法（静态方法）
 * 		      作用：能够节约、控制系统资源
 * 
 * 应用场景：当只需要一个实例对象的时候，就可以考虑使用单例模式。比如，在资源共享的
 * 情况下，避免由于多个资源操作导致的性能或损耗等就可以使用单例模式。
 * 
 * 静态内部类
 * 特点：利用JVM自身机制来保证线程安全，因为ManHolder类是私有的，除了get()之外
 * 没有其他方式可以访问实例对象，而且只有在调用get()时才会去真正创建实例对象。
 * 
 * @author ShowLu
 *
 */
public class Man {
	
	private static class ManHolder{
		private static final Man man=new Man();
	}
	
	private Man(){}
	
	public static Man get(){
		return ManHolder.man;
	}

}
