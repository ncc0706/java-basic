package com.xlinyu.basic.enum00;

public class Enum03 {

	enum Colors {
		
		RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4); 
		
		private String name;
		
		private int index;
		
		private Colors(String name, int index){
			this.name = name;  
	        this.index = index;
		}

		public static String getName(int index){
			for(Colors color: Colors.values()){
				if(color.getIndex() == index){
					return color.name;
				}
			}
			return null;
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
		String name = Colors.getName(3);
		System.out.println(name);
	}
}
