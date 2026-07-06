package assignment_71_to_80;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment_78 {

	public static void main(String[] args) {
		System.out.println("Write a program to demonstrate Set interface using HashSet class. Perform the following operations: 1. Add elements using add() method 2. Add duplicate elements (check the output) 3. Print all elements 4. Check size of Set 5. Check whether an element is present using contains() 6.Iterate using iterator() method 7.create one more set and check below methods addAll() containsAll() equals() remove() removeAll() clear() isEmpty()\n");
		
		HashSet<Integer> h1 = new HashSet<>(Arrays.asList(21, 22, 23, 24, 25));
		System.out.println("The initial set is: "+ h1);
		
		//1. adding elements using add()
		h1.add(26);
		System.out.println("After adding an element: \n"+h1);
		
		//2. adding duplicate elements
		h1.add(23);//It'll stay the same bcs Set doesn't allow duplicate values

		//3. print the HashSet
		System.out.println("After adding duplicate element 23 the set becomes:"+h1);
		
		//4. Check the size of the HashSet
		int s = h1.size();
		System.out.println(s);
		
		//5. check whether an element is present of not
		boolean b = h1.contains(25);
		System.out.println(b);
		
		//6. Iterate using Iterator
		Iterator<Integer> i1 = h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		//7. create one more set and check below methods
		HashSet <Integer> h2 = new HashSet<>(Arrays.asList(26, 27,28,29,30));
		h2.addAll(h1);
		System.out.println("After adding: "+ h2);
		
		boolean b2 = h2.containsAll(h1);
		System.out.println("h2 contains h1: "+b2);
		
		boolean b3 = h2.equals(h1);
		System.out.println("two sets are equal: "+b3);
		
		h2.remove(22);
		System.out.println("After removal of 22 from the Set: "+ h2);
		
		h2.removeAll(h1);
		System.out.println("After removal of set h1 from the Set h2: "+ h2);
		
		h2.clear();
		System.out.println(h2);
		
		boolean b4 = h2.isEmpty();
		System.out.println("h2 is empty: "+ b4);
		
	}

}
