package com.xlinyu.basic;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class AppTest{
	
	/**
	 * ArrayList增长机制 原来的1.5倍
	 */
	@Test
	public void t01(){
		int count = 100;
		int newCount = count + (count >> 1);
		BigDecimal n1 = new BigDecimal(newCount);
		BigDecimal n2 = new BigDecimal(count);
		assertEquals(1.6, n1.divide(n2).doubleValue(), 0.1);
	}

	/**
	 * BigDecimal简单使用
	 */
	@Test
	public void t02(){
		BigDecimal n1 = new BigDecimal(15);
		BigDecimal n2 = new BigDecimal(10);

		// BigDecimal类型
		assertEquals(new BigDecimal(1.5), n1.divide(n2));
		// intValue为int类型
		assertEquals(1, n1.divide(n2).intValue());
		
	}
	
}
