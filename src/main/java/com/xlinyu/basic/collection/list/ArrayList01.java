package com.xlinyu.basic.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// 有序可以重复
		List<Object> data = new ArrayList<>();
		
		data.add(123);
		data.add(123);
		data.add("This is a str");
		data.add(null);
		data.add(null);
		// 替换指定下标的元素
		data.set(4, "下标为4的元素还是null吗");
//		System.out.println(data.size());
		
		for(int i=0;i<data.size();i++){
//			System.out.println(data.get(i));
		}
	}
	
}
