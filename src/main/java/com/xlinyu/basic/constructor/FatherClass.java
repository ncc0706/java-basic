package com.xlinyu.basic.constructor;

public class FatherClass {


	public FatherClass(){
		System.out.println("父类构造器.");
	}
	
	// 非静态初始化块
	{
		System.out.println("This is FatherClass.");
		
	}
	
}
