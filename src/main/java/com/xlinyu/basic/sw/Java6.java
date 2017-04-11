package com.xlinyu.basic.sw;

public class Java6 {

	public static void main(String[] args) {
		testInt();
		testEnum();
	}
	
	/**
	 * Java6之前
	 * switch 控制表达式支持的类型有byte、short、char、int、enum（Java 5）
	 */
	public static void testInt(){
		int i = 5;
		switch (i) {
		case 1:
			System.out.println("value is " + 1);
			break;

		case 5:
			System.out.println("value is " + 5);
			break;
			
		default:
			System.out.println("value is default.");
			break;
		}
	}
	
	static enum Score{
		A, B, C, D
	}
	
	/**
	 * 枚举类型
	 */
	public static void testEnum(){
		Score s = Score.B;
		switch (s) {
		case A:
			System.out.println("成绩为: " + "A");
			break;

		case B:
			System.out.println("成绩为: " + "B");
			break;
			
		default:
			System.out.println("成绩为: default");
			break;
		}
	}
	
}
