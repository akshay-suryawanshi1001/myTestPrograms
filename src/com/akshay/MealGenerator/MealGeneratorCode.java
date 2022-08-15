package com.akshay.MealGenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MealGeneratorCode {
	
	public String getMenuName(int i) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Anda Curry");
		map.put(2, "chicken");
		map.put(3, "mutton");
		map.put(4, "anda bhurji");
		map.put(5, "bharit");
		map.put(6, "mataki usal");
		map.put(7, "mathachi daal");
		map.put(8, "varan chikolya");
		map.put(9, "bhendi chi bhaji");
		map.put(10, "masur chi daal");
		map.put(11, "kobi chi bhaji");
		map.put(12, "flower chi bhaji");
		map.put(13, "kandyachi paat");
		map.put(14, "kadhi khichadi");
		map.put(15, "bhajanchi aamti");
		map.put(16, "daal baati");
		map.put(17, "paatodichi bhaji");
		String bhajiName = map.get(i);
		return bhajiName;
	}

	public static void main(String[] args) {
		Random r = new Random();
		//System.out.println(r.nextInt(10));
		MealGeneratorCode m = new MealGeneratorCode();
		System.out.println(m.getMenuName(r.nextInt(18)));
		
	}

}
