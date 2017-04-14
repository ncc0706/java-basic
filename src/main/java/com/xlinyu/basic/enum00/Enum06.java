package com.xlinyu.basic.enum00;

public class Enum06 {

	enum Coffee implements Food {
		BLACK_COFFEE, DECAF_COFFEE, LATTE, CAPPUCCINO;

		@Override
		public void print() {
			System.out.println(this.ordinal());
		}
	}

	enum Dessert implements Food {
		FRUIT, CAKE, GELATO;

		@Override
		public void print() {
			System.out.println(this.name());
		}
	}
	
	public static void main(String[] args) {
		Coffee.BLACK_COFFEE.print();
		Dessert.CAKE.print();
	}

}

interface Food {

	default void info(){
		
	}
	
	void print();
}
