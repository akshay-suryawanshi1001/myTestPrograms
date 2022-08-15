package org.akshay.compare;

import java.util.Comparator;

public class RatingComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		/*if(o1.getRating() > o2.getRating())
			return 1;
		else if(o1.getRating() < o2.getRating())
			return -1;
		else
			return 0;*/
		return o1.getId() - o2.getId();
		
	}

}
