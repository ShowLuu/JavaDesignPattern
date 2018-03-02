package com.ss.design.test;

import com.ss.design.impl.VideoFans;
import com.ss.design.impl.VideoSite;

/**
 * 观察者模式，即"发布者-订阅者|源-监听",由一个目标对象管理所有依赖与它的观察者对象，并且
 * 当这个目标对象自身发生改变时，会主动向它的观察者们发出通知。
 * 
 * @author ShowLu
 *
 */
public class ObserverTest {
	
	public static void main(String[] args) {
		
		VideoSite vs=new VideoSite();
		vs.registerObserver(new VideoFans("LiLei"));
		vs.registerObserver(new VideoFans("HanMeimei"));
		
		vs.addVideos("Video 1");
		System.out.println("------");
		vs.registerObserver(new VideoFans("XiaoMing"));
		vs.addVideos("video 2");
		
	}

}
