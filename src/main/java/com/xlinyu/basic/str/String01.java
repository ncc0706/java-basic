package com.xlinyu.basic.str;

import java.util.ArrayList;
import java.util.List;

public class String01 {

	public static void main(String[] args) {
		String str = "Hello World Java C C++ Python";
//		String[] strs = str.split(" ");
//		for(String st:strs){
//			System.out.print (st);
//		}
		
		int index = str.indexOf(" ");
		String s1 = str.substring(0, index);
		System.out.println(s1);
		List<String> datas = new ArrayList<String>();
		datas.add(s1);
		
	}
	
}
