package com.xlinyu.basic.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		Set<String> datas = new LinkedHashSet<String>();
		
		boolean f0 = datas.add("ccc");
		System.out.println(f0);
		// 元素已经存在 返回false
		boolean f = datas.add("ccc");
		System.out.println(f);
		datas.add("aaa");
		datas.add("99999");
		datas.add("bbbbbbbbbbb");
		datas.add(null);
		Iterator<String> iterator = datas.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
}
