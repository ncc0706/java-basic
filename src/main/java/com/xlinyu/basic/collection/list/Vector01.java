package com.xlinyu.basic.collection.list;

import java.util.List;
import java.util.Vector;

public class Vector01 {

	public static void main(String[] args) {
		List<String> v = new Vector<String>(10);
		v.add("abc");
		v.add("def");
		v.add("are you ok");
		v.add(null);
//		System.out.println(v.size());
		
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
	}
	
}
