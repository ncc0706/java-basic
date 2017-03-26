package com.xlinyu.basic.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap01 {

	public static void main(String[] args) {
		Map<String, String> datas = new HashMap<String, String>();
		
		datas.put("中国", "北京");
		datas.put("美国", "纽约");
		datas.put("英国", "伦敦");

		// entryset 遍历一次就把key、value 都放到entry中了。
		Iterator<Entry<String, String>> it = datas.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, String> entry = it.next();
			String key = entry.getKey();
			System.out.println("key: " + key + ", value: " + datas.get(key));
		}
		System.out.println("---------");
		Iterator<String> iterator = datas.keySet().iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			System.out.println("key: " + key + ", value: " + datas.get(key));
		}
	}
	
}
