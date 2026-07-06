package assignment_91_to_100;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Assignment_94 {
	public static void main(String[] args) {
		System.out.println("Write a Java program to create Singleton List, Singleton Set, and Singleton Map using Collections class and handle UnsupportedOperationException.");
		
		List<Integer> l1 = Collections.singletonList(11);
		Set<String> s1 = Collections.singleton("Tanmay");
		Map<Integer, String> m1 = Collections.singletonMap(4, "Joey");
		try {
		l1.add(22);
		}
		catch(UnsupportedOperationException c1)
		{
			System.out.println("\n\n\nList exception handled");
		}
		try {
		s1.add("Tanuja");
		}
		catch(UnsupportedOperationException c2)
		{
			System.out.println("\nSet exception handled");
		}
		try {
		m1.put(2, "Chandler");
		}
		catch(UnsupportedOperationException c3)
		{
			System.out.println("\nMap exception handled");
		}

	}

}
