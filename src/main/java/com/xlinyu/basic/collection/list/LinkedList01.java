package com.xlinyu.basic.collection.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

	public static void main(String[] args) {
		LinkedList<String> datas = new LinkedList<String>();  
		datas.add("1");  
		datas.add("2");  
		datas.add("3");  
		datas.add("4");  
		datas.add("5");
		datas.add("1");
//		datas.pop(); // 出栈
		datas.peek(); // 出栈 但不删除
		datas.push("99999"); //addFirst
		// first element
//		System.out.println(datas.getFirst());
		datas.add(null);
		// last element
//		System.out.println(datas.getLast());
//		for(String str:datas){
//			System.out.println(str);
//		}
		System.out.println("----线程安全的list-----");
		List<String> sDatas = Collections.synchronizedList(datas);
		for(String s:sDatas){
			System.out.println(s);
		}
	}
	
}
