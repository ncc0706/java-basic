package com.xlinyu.basic.static0;

public class TestStatic {

	// 非法向前引用
//	int num1 = num2 + 2;
//	int num2 = 8;
	
	// 非法向前引用
//	static int num1 = num2 + 2;
//	static int num2 = 8;

	/**
	 * static 修饰的成员变量是类变量,属于类本身
	 * 没有static修饰的成员变量是实例变量,属于类的实例
	 */
	int num1 = num2 + 2;
	static int num2 = 8;
	
	public static void main(String[] args) {
		TestStatic ts = new TestStatic();
		System.out.println(ts.num1);
	}
}


