package com.xlinyu.basic.enum00;

public class Enum05 {

	

	enum Colors implements Behaviour{
		
		RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLOW("黄色", 4);

		private String name;
		
		private int index;
		
		private Colors(String name, int index){
			this.name = name;
			this.index = index;
		}
		
		@Override
		public void print() {
			System.out.println(this.name + "_" + this.index);
		}

		@Override
		public String getInfo() {
			return this.name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}
	}
	
	public static void main(String[] args) {
		Colors.BLANK.print();
		System.out.println(Colors.GREEN.getInfo());
	}
	
}

interface Behaviour {

	void print();

	String getInfo();
}