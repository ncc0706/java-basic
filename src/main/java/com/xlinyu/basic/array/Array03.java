package com.xlinyu.basic.array;

public class Array03 {

	public static void main(String[] args) {
		int[] iArr = null;
		// 只要不访问iArr的属性和方法,程序完全可以使用数组变量
		System.out.println(iArr);
		
		// 指向有效的数组对象后,才可以访问
		iArr = new int[10];
		System.out.println(iArr.length);
	}
}
