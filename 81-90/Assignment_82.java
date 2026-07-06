package assignment_81_to_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Assignment_82 {

	public static void main(String[] args) {
		System.out.println("WAP on collection properties add marks in to collection Iterate using iterator() create one more collection with numbers explore below methods addAll() remove() contains() containsAll() size() removeAll() clear() isEmpty() equals()");
		
		Collection<Integer> c1 = new ArrayList<Integer>(Arrays.asList(12,23,34,45,56,67));
		System.out.println("\nThe 1st collection: "+c1);
		
		c1.add(78);				c1.add(89);
		
		Iterator <Integer> i1 = c1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}	
		Collection<Integer> c2 = new ArrayList<Integer>(Arrays.asList(11,22,33,44));
		System.out.println("\nThe 2nd collection: "+c2);
		
		c2.addAll(c1);
		System.out.println("\nAfter adding 1st Collection in the 2nd one: "+c2);
		
		System.out.println(c2.equals(c1));
		
		c2.remove(33);
		
		System.out.println(c2.contains(56));
		
		System.out.println(c2.containsAll(c1));
		
		System.out.println("\nSize of the 2nd Collection is: " + c2.size());
		
		c2.removeAll(c1);
		c2.clear();
		System.out.println("The 2nd Collection is empty: "+c2.isEmpty());
		
	}

}
