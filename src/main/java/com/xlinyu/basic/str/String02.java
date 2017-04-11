package com.xlinyu.basic.str;

public class String02 {

	public static void main(String[] args) {
		/**
		 * 存放在字符串常量池中
		 */
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1 == s2);
		
		String s3 = s1;
		System.out.println(s2 == s3);
		
		// new 分配的空间在堆上面
		String s4 = new String("Hello");
		System.out.println(s3 == s4);
		
		// 同上也是分配在堆内存上
		String s5 = new String("Hello");
		System.out.println(s4 == s5);
	}
	
}
