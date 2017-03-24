package com.xlinyu.basic.array;

public class Array01 {

	public static void main(String[] args) {
		
		// 1. 数组就是相同数据类型的有序集合
		// 2. 数组也是对象.数组元素相当于对象的成员变量
		// 3. 数组长度是确定的,不可变的.
		
		// 使用数组前必须初始化
		
		/**
		 * 初始化的方式:
		 * 1. 静态初始化
		 * 2. 动态初始化
		 */
		
		// 静态初始化
		String[] books = new String[]{
			"Java In Action",
			"Hadoop In Action",
			"Maven In Action"
		};
		
		// 静态初始化(简化方式)
		String[] names = {
			"唐玄奘",
			"孙悟空",
			"猪八戒",
			"沙悟净"
		};
		
		// 动态初始化
		String[] strArr = new String[5];
		
		System.out.println(books.length);
		System.out.println(names.length);
		System.out.println(strArr.length);
		
		
		
	}
	
}
