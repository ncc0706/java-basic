package com.xlinyu.basic.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		
		ArrayList<String> datas = new ArrayList<String>(4);
		datas.add("唐三藏");
		datas.add("孙悟空");
		datas.add("猪悟能");
		datas.add("沙悟净");
		System.out.println("new ArrayList方式");
		// 1.使用new ArrayList(datas)的方式创建新List
		List<String> d1 = new ArrayList<String>(datas);
		Iterator<String> iterator = d1.iterator();
		while(iterator.hasNext()){
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println("Collections.copy 方式");
		List<String> d2 = new ArrayList<String>(Arrays.asList(new String[datas.size()]));
		Collections.copy(d2, datas);
		for(String name:d2){
			System.out.println(name);
		}
		System.out.println("ArrayList.clone 方式");
		@SuppressWarnings("unchecked")
		List<String> d3 = (ArrayList<String>)datas.clone();
		for(int i=0;i<d3.size();i++){
			System.out.println(d3.get(i));
		}
	}
	
}
