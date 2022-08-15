package org.akshay.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareExample {

	public static void main(String[] args) {
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee(5,"dd",5.0));
		eList.add(new Employee(1,"cc",1.0));
		eList.add(new Employee(3,"bb",3.0));
		eList.add(new Employee(4,"aa",4.0));
		System.out.println("Employee list before sorting is : " );
		for(Employee ee : eList) {
			System.out.println(ee.getId() + " " + ee.getName() + " "+ee.getRating());
		}
		Collections.sort(eList);
		System.out.println("\n" + "Employee list after sorting is : " );
		for(Employee ee : eList) {
			System.out.println(ee.getId() + " " + ee.getName() + " "+ee.getRating());
		}
		
		System.out.println("\n" + "Employee list after sorting using NameComparator is : " );
		Collections.sort(eList, new NameComparator());
		for(Employee ee : eList) {
			System.out.println(ee.getId() + " " + ee.getName() + " "+ee.getRating());
		}
		
		System.out.println("\n" + "Employee list after sorting using RatingComparator is : " );
		Collections.sort(eList, new RatingComparator());
		for(Employee ee : eList) {
			System.out.println(ee.getId() + " " + ee.getName() + " "+ee.getRating());
		}
	}

}
