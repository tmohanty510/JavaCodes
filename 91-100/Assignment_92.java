package assignment_91_to_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment_92 {

	public static void main(String[] args) {
		System.out.println("Write a java program on unmodifiable collections. 1) Create unmodifiable List, Set, and Map using Collections class. 2) Display all collections. 3) Try to modify the collections. 4) Handle UnsupportedOperationException using try-catch block\n\n\n\n");
		try {
		//1. Creating unmodifiable List, Set and Map 
		List<Integer> l1 = new ArrayList<> (Arrays.asList(12,13,14,15,16));
		l1 = Collections.unmodifiableList(l1);
		System.out.println(l1);
		
		Set<Integer> s1 = new HashSet<> (Arrays.asList(21,22, 23, 24, 25, 26));
		Collections.unmodifiableSet(s1);
		System.out.println(s1);
		
		Map<Integer, String> m1 = new HashMap<> ();
		m1.put(1, "Abhi");		m1.put(2, "Bijay");		m1.put(3, "Chiru");		m1.put(4, "Deepak");		m1.put(5, "Ekta");
		Collections.unmodifiableMap(m1);
		System.out.println(m1);
		
		//2. Displaying the collections
		System.out.println("\n\nInitial List: "+l1);
		System.out.println("\nInitial Set: "+s1);
		System.out.println("\nInitial Map: "+m1);
		
		//3. Trying to modify the collections
		l1.add(22);
		s1.add(44);
		m1.put(6, "Falak");
		
		}
		catch(UnsupportedOperationException c1)
		{
			System.out.println("\n\nThe collection is unmodifiable, More elements can not be added.");
		}
	}

}
