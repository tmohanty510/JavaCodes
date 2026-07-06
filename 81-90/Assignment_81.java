package assignment_81_to_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment_81 {

	public static void main(String[] args) {
		System.out.println("WAP Set to List. Then add more elements to it and print\n\n\n");
		
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(88, 92, 1, 33, 4, 71));
		System.out.println("The initial Set: \n"+s1);
		
		//Converting Set into List
		
		List<Integer> l1 = new ArrayList<Integer>(s1);
		System.out.println("\nAfter converting Set into a List: \n"+l1);
		
		//adding more elements into the list
		
		l1.add(21);
		l1.add(44);
		l1.add(40);
		
		//Printing the List
		System.out.println("\nAfter adding some elements, the list finally becomes: \n"+l1);

	}

}
