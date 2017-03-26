package com.xlinyu.basic.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet01 {

	// TreeSet 是SortedSet接口的实现类
	public static void main(String[] args) {
		
		// 内部是TreeMap实现的
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("b");
//		boolean f = ts.add("b"); // 返回false
//		System.out.println(f);
		ts.add("a");
		ts.add("ddddddd");
		// 不允许null元素
//		ts.add(null);
		ts.add("ccccccc");
//		System.out.println(ts.size());
		
		// TreeSet是有序的
		Iterator<String> iterator = ts.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
}
