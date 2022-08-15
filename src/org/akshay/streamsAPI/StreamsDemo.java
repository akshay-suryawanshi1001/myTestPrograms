package org.akshay.streamsAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	
	public static void main(String args[]) {
		Integer[] intArr = {12,23,99,34,33,55}; 
		
		long arrSize = Stream.of(intArr).count();
		System.out.println("array size is "+ arrSize);
		
		List<Integer> evenList = Stream.of(intArr).filter(i -> i % 2 ==0).collect(Collectors.toList());
		System.out.println("even num list is "+ evenList);
		
		List<Integer> addFiveToEach = Stream.of(intArr).map(i -> i + 5).sorted().collect(Collectors.toList());//natural order sorting
		System.out.println("added 5 to each and sorted :" + addFiveToEach);
		
		List<Integer> sortInReverseTypeOne = Stream.of(intArr).sorted( (i,j) -> j.compareTo(i)).collect(Collectors.toList());
		System.out.println("sorted in reverse order type 1 :" + sortInReverseTypeOne);
		
		Comparator<Integer> comp = (i1,i2) -> {
			if(i1<i2)
				return 1;
			else if(i1>i2)
				return -1;
			else
				return 0;
		};
		List<Integer> sortInReverseTypeTwo = Stream.of(intArr).sorted(comp).collect(Collectors.toList());
		System.out.println("sorted in reverse order type 2 :" + sortInReverseTypeTwo);
		
		List<Integer> sortInReverseTypeThree = Stream.of(intArr).sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("sorted in reverse order type 3 :" + sortInReverseTypeThree);
		
		long minFromList = sortInReverseTypeThree.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("minimum from sorted list :" + minFromList);
		
		long maxFromList = sortInReverseTypeThree.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("maximum from sorted list :" + maxFromList);
	}
}
