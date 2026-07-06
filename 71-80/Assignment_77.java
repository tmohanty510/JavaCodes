package assignment_71_to_80;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
public class Assignment_77 {
	public static void main(String[] args) {
		System.out.println("Write a program to demonstrate List interface using ArrayList class. Store employee IDs in a List and perform the following operations: 1. Add employee IDs 2. Add one ID at index 1 3. Remove one employee ID 4. Check whether an ID is present 5. Iterate all IDs Iterator and listIterator methods 6. get() method 7. Print the  result");
		ArrayList <Integer> e1 = new ArrayList<Integer>(Arrays.asList(12, 13, 14, 15, 16));
		System.out.println("\n\n1. The Initial ArrayList: "+e1);
		//1.adding emp id using add()
		e1.add(17);
		//2. adding an emp id at index position 1
		e1.add(1, 11);
		//3. removing an emp id
		e1.remove(Integer.valueOf(16));
		System.out.println("\n2. After removing '16' the employee list becomes: "+e1);
		
		//4. check if emp id is present or not
		boolean b = e1.contains(14);
		System.out.println("\n3. Checking if 14 is present in the employee list: "+b);
		
		//5. Iterate using iterator() and ListIterator()
		Iterator<Integer> i1 = e1.iterator();
		System.out.println("\n4. Forward Iteration using Iterator interface: ");
		while(i1.hasNext())
		{System.out.println(i1.next());
		}
		ListIterator<Integer> i2 = e1.listIterator();
		System.out.println("5. Forward Iteration using ListIterator interface: ");
		while(i2.hasNext())
		{System.out.println(i2.next());
		}
		System.out.println("6. Backward Iteration using ListIterator interface: ");
		while(i2.hasPrevious())
		{System.out.println(i2.previous());
		}
		//6. get()
		System.out.println("7. Fetching the value at index 3: "+e1.get(3));
	}

}
