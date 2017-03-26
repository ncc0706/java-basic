package com.xlinyu.basic.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap01 {

	public static void main(String[] args) {
		Map<String, String> datas = new LinkedHashMap<String, String>();
		datas.put("中国", "北京");
		datas.put("美国", "纽约");
		datas.put("英国", "伦敦");
		datas.put(null, "加拿大");
		datas.put(null, "莫斯科");
		datas.put("澳大利亚", null);
		datas.put("俄罗斯", null);

		// entryset 遍历一次就把key、value 都放到entry中了。
		Iterator<Entry<String, String>> it = datas.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, String> entry = it.next();
			String key = entry.getKey();
			System.out.println("key: " + key + ", value: " + datas.get(key));
		}
	}
	
}
