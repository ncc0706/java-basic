package com.xlinyu.basic.collection.list;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		// 会出现栈内存溢出的错误
		new ArrayList<String>(Integer.MAX_VALUE);
	}
	
}
