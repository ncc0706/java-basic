package com.xlinyu.basic.collection.list;

import org.junit.Test;

public class ArrayList03Test {

	@Test
	public void test() {
		ArrayList03 a03 = new ArrayList03();
		String[] names = null;
		a03.setNames(names);
		System.out.println(a03.getNames().length);
	}

}
