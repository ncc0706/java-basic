package com.xlinyu.basic.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLlist05 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>(5);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		// 使用 reverse方法实现list的反转
		Collections.reverse(numbers);
		
//		for(Integer num:numbers){
//			System.out.println(num);
//		}
		
		List<String> strs = new ArrayList<String>(5);
		strs.add("a");
		strs.add("b");
		strs.add("c");
		strs.add("d");
		strs.add("e");
		// 实现list反转
		Collections.reverse(strs);
		for(String str:strs){
			System.out.println(str);
		}
	}
	
}
