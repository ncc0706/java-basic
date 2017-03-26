package com.xlinyu.basic.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap01 {

	public static void main(String[] args) {
		ConcurrentHashMap<Object, Object> ch = new ConcurrentHashMap<Object, Object>();
		// not allow null value
//		ch.put(null, "sdf");
		
		// not allow null key
//		ch.put(null, "不允许null");
		
		ch.put("Hello", "World");
		
		Iterator<Entry<Object, Object>> iterator = ch.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<Object, Object> entry = iterator.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
	
}
