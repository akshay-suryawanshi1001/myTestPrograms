import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingDeque;

import com.google.common.collect.ImmutableList;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> al =new LinkedList<Integer>();
		al.add(200);
		al.add(11);
		al.add(12);
		Collections.addAll(al, 44,55,66);
		System.out.println("this is arrayList :" + al);
		Collections.sort(al);
		System.out.println("this is sorted arrayList :" + al);
		System.out.println("index of 44 is  :" + Collections.binarySearch(al, 44));
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("this is reverse sorted arrayList :" + al);
		System.out.println("#################################");
		Queue<Integer> qu = new PriorityQueue<Integer>();
		qu.add(100);
		qu.add(11);
		qu.add(12);
		System.out.println("this is priorityQueue" + qu);
		System.out.println("this peek of  priorityQueue :" + qu.peek());
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(23);
		set.add(11);
		set.add(23);
		set.add(100);
		System.out.println("this is HashSet :" + set);
		Vector<Integer> v = new Vector<Integer>();
		v.add(34);
		v.add(11);
		v.add(33);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println("Current Ele is " +e.nextElement());
		}
		System.out.println("Current Class is " +e.getClass().getName());// $ in the output shows that inner classes are used here 
		System.out.println("##########################################");
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(34);
		ll.add(11);
		ll.add(100);
		ll.add(1);
		System.out.println("first ele is :" +ll.peekFirst());
		System.out.println("linked list is :" + ll);
		displayImmutable(al);
		System.out.println("##########################################");
		Queue<Integer> que = new PriorityQueue<Integer>();
		que.add(5);que.add(12);que.add(34);que.add(1);
		System.out.println("priority queue is :" + que);
		Queue<String> queStr = new PriorityQueue<String>();
		queStr.add("rohit");queStr.add("akshay");queStr.add("v");queStr.add("nilam");
		System.out.println("priority queue is :" + queStr);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(23);
		deque.add(1);
		deque.offer(3);
		//deque.addFirst(1);
		//deque.addLast(2);
		deque.push(33);
		//deque.add(null); null not allowed in deque
		System.out.println("Dequeue is :" + deque);
		LinkedBlockingDeque<Integer> lbdq = new LinkedBlockingDeque<Integer>();
		Iterator itr2 = lbdq.descendingIterator();
		
		int myArr[] = {1,3,5,7};
		System.out.println("this is my integer array :" + Arrays.toString(myArr));
	}
	public static <T> void displayImmutable(List<T> list) {
		ImmutableList<T> immuL = ImmutableList.copyOf(list);
		
		System.out.println("this is immutable list :" + immuL);
	}
}
