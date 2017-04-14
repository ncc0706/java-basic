package com.xlinyu.basic.enum00;

public class Enum04 {

	enum Colors{
		RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLOW("黄色", 4);
		
		private String name;
		
		private int index;
		
		private Colors(String name, int index){
			this.name = name;
			this.index = index;
		}
		
		/**
		 * 覆盖toString()方法
		 */
		@Override
		public String toString() {
			return this.index + "_" + this.name;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Colors.YELLOW);
	}
}
