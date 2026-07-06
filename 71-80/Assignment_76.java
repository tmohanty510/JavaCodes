
package assignment_71_to_80;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
public class Assignment_76 {
	public static void main(String[] args) {
		System.out.println("Write a program to demonstrate Iterator and ListIterator methods in ArrayList. Store employee names in an ArrayList and perform the following operations: 1. Iterate elements using Iterator and print in forward direction 2. Iterate elements using ListIterator  and Print elements in forward and backward direction 3. Add a new element using add() method 4. Replace an element using set() method 5. Remove an element using remove() method");
		ArrayList<String> emp = new ArrayList<String>(Arrays.asList("Tanmay", "Manish", "Vishal", "Rajiv", "Ramesh"));
		System.out.println(emp);
		
		//1. Performing Iterator operation Forward Direction
		Iterator<String> i1 = emp.iterator();
		System.out.println("Forward Iteration using Iterator Interface");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		//2. Performing Iterator and ListIterator operation in Forward & Backward Direction
		ListIterator<String> i2 = emp.listIterator();
		System.out.println("Forward Iteration using ListIterator Interface");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Backward Iteration using ListIterator Interface");
		while(i2.hasPrevious())
		{	System.out.println(i2.previous());
		}
		//3. adding a new element using add() method
		emp.add("Deb");
		System.out.println(emp);
		
		//4. replacing an element using set() method
		emp.set(4, "Souvik");
		System.out.println(emp);
		
		//5. removing an element using remove() method
		emp.remove(4);
		System.out.println(emp);
	}
}
