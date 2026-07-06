package assignment_71_to_80;

import java.util.ArrayList;

public class Assignment_74 {

	public static void main(String[] args) {
		System.out.println("WAP to create ArrayList of Character,Object,Float datatypes. Add elements to it and print it\n\n\n");
		
		ArrayList<Character> a1 = new ArrayList<>();
		a1.add('A');
		a1.add('B');
		a1.add('C');
		a1.add('D');
		a1.add('E');
		a1.add('F');
		System.out.println("ArrayList of Character type:");
		System.out.println(a1);
		
		ArrayList<Object> a2 = new ArrayList<>();
		a2.add("Tanmay");
		a2.add(510);
		a2.add('T');
		a2.add(true);
		a2.add(13.52);
		a2.add(23.56f);
		a2.add(null);
		System.out.println("\nArrayList of Object type:");
		System.out.println(a2);
		
		ArrayList<Float> a3 = new ArrayList<>();		
		a3.add(2.4f);
		a3.add(1.3f);
		a3.add(5.1f);
		a3.add(6.7f);
		a3.add(13.52f);
		System.out.println("\nArrayList of Float type:");
		System.out.println(a3);
	
	}

}
