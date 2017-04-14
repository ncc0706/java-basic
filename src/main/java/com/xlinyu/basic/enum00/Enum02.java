package com.xlinyu.basic.enum00;

public class Enum02 {

	enum Colors {
		RED, GREEN, YELLOW
	}
	
	public static void main(String[] args) {
		
		Colors color = Colors.YELLOW;
		
		switch(color){
			case RED:
				System.out.println("color: " + Colors.GREEN);
				break;
			case YELLOW:
				System.out.println(Colors.YELLOW);
				break;
			default: 
				System.out.println("ok");
		}
	}
	
}
