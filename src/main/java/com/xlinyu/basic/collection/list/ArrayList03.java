package com.xlinyu.basic.collection.list;

import java.util.Arrays;

public class ArrayList03 {

	String[] names;

	public String[] getNames() {
		return names;
	}

	// ArrayList被直接赋给成员变量----安全隐患
	public void setNames(String[] names) {
		if(names == null){
			this.names = new String[0];
		}else{
			this.names = Arrays.copyOf(names, names.length);
		}
	}
	
}
