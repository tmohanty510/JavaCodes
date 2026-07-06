package assignment_91_to_100;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Assignment_91 {
	
	public static void main(String[] args) {
		System.out.println("WAP on below Collections methods fill() copy() replaceAll() rotate() disjoint() addAll()\n");
		
		List<Integer> l1 = new ArrayList<> (Arrays.asList(87, 65, 32, 45, 98));
		System.out.println("\nThe list l1 initially is: "+l1);
		List<Integer> l2 = new ArrayList<> (Arrays.asList(11, 22, 33, 44, 55));
		System.out.println("\nThe list l2 initially is: "+l2);
		
		//1. fill()
		Collections.fill(l2, 33);
		System.out.println("\n1.After fill() the l2 becomes: "+l2);
		
		//2. copy()
		Collections.copy(l2, l1);
		System.out.println("\n2.After copy() the list l2 becomes: "+l2);
		
		//3. replaceAll()
		Collections.replaceAll(l2, 45, 18);
		System.out.println("\n3.After replaceAll() the list l2 becomes: "+l2);
		
		//4.rotate()
		Collections.rotate(l2, -3);
		System.out.println("\n4.After rotate() the list l2 becomes: "+l2);
		
		//5. disjoint()
		boolean d = Collections.disjoint(l1, l2);
		System.out.println("\n5.The two lists l1 & l2 have common elements: "+d);
		
		//6. addAll()
		Collections.addAll(l2, 71, 88, 35, 100);
		System.out.println("\n6.After addAll() the list becomes: "+l2);

	}

}
