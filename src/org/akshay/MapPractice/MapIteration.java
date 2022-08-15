package org.akshay.MapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {
	
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "mango");
		map.put(2, "apple");
		map.put(3, "orange");
		map.put(4, "guava");
		map.put(5, "lichi");
		//1.iterate using keySet in for loop
		System.out.println("1. iterate using keySet in for loop");
		for(Integer fruit : map.keySet()) {
			System.out.println("key :" + fruit + "    value: " + map.get(fruit));
		}
		System.out.println();
		
		//2. iterate using keySet in iterator
		System.out.println("2. iterate using keySet in iterator");
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			System.out.println("key: " + key + "  value: " + map.get(key));
		}
		System.out.println();
		
		//3. iterate using entrySet in iterator
		System.out.println("3. iterate using entrySet in iterator");
		Iterator<Map.Entry<Integer, String>> itr2 = map.entrySet().iterator();
		while(itr2.hasNext()) {
			Map.Entry<Integer, String> keySet = itr2.next();
			System.out.println("key: " + keySet.getKey() + "  value: " + keySet.getValue());
		}
		System.out.println();
		
		//4. iterate using forEach loop
		System.out.println("4. iterate using forEach loop");
		map.forEach((key,value) -> {
			System.out.println("key: " + key + "  value: " + value);
		});
		
		System.out.println();
		
		//5. iterate using streams
		System.out.println("5. iterate using streams");
		map.entrySet().stream().forEach((e) -> {
			System.out.println("kay: " + e.getKey() + "  value: "+e.getValue());
		});
	}

}
