package com.xlinyu.basic.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet01 {

	public static void main(String[] args) {
		
		Set<Integer> mSetInt = new HashSet<Integer>();
		
		Set<String> mSetString = new HashSet<String>();
		// LinkedHashSet是有序的
		Set<String> linkedStringSet = Collections.synchronizedSet(new LinkedHashSet<String>());
		
		for(int i=0;i<50;i++){
			mSetInt.add(i);
			mSetString.add(String.valueOf(i));
			linkedStringSet.add(String.valueOf(i));
		}
		
		Iterator<Integer> setIntIt = mSetInt.iterator();
		while(setIntIt.hasNext()){
			System.out.print(setIntIt.next()+ " ");
		}
		System.out.println("");
		Iterator<String> setStringIt = mSetString.iterator();
		while(setStringIt.hasNext()){
			System.out.print(setStringIt.next()+ " ");
		}
		
		System.out.println("");
		Iterator<String> iterator = linkedStringSet.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
	}
	
}
