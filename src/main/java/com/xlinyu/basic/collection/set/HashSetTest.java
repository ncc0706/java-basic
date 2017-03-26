package com.xlinyu.basic.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		/**
		 * 无序 不重复
		 */
		Set<String> data = new HashSet<String>();
		data.add(null);
		data.add("你好");
		data.add("a");
		data.add(null);
		data.add("HelloWorld");
		data.add("HelloWorld"); // 不允许重复元素
		data.add("b");
//		System.out.println(data.size());
		for(String str:data){
			System.out.println(str);
		}
	}
	
}
