package com.xlinyu.basic.enum00;

public class Enum01 {

	
	enum Colors {
		RED, GREEN, BLANK, YELLOW
	}
	
	public static void main(String[] args) {
//		System.out.println(Colors.BLANK);
		for(Colors color: Colors.values()){
			System.out.println(color + " ordinal " + color.ordinal());
		}
	}
}
