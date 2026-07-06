package assignment_71_to_80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment_80 {

	public static void main(String[] args) {
		System.out.println("WAP convert List to Set . Then add more elements to it and print");
		
		List<Integer> l1 = new ArrayList<>(Arrays.asList(23, 98, 72, 61, 45));
		System.out.println("\n\nList: \n"+ l1);
		
		//Converting List to Set
		Set<Integer> s1 = new HashSet<>(l1);
		System.out.println("\n\nSet: \n"+s1);
		
		//Adding more elements into the Set
		s1.add(77);
		s1.add(99);
		s1.add(10);
		System.out.println("\n\nSet after adding few elements: \n"+s1);

	}
	
}
