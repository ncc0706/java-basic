package com.xlinyu.basic.static0;

public class StaticInitTest {

	static int count = 2;
	
	static {
		System.out.println("静态初始化块");
	
		name = "Java 编程思想";
		count = 20;
	}
	
	static String name = "Java In Action";
	
	public static void main(String[] args) {
		System.out.println(StaticInitTest.count);
		System.out.println(StaticInitTest.name);
	}
}
