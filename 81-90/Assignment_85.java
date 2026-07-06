package assignment_81_to_90;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment_85 {
	public static void main(String[] args) {
		System.out.println("Write a program to demonstrate Map interface using HashMap class. Perform the following operations: Create a HashMap of employee ID and employee name Add elements using put() method Add element using putIfAbsent() method Create another HashMap and copy elements using putAll() Remove an element using remove() method Check whether a key is present using containsKey() Check whether a value is present using containsValue() Retrieve value using get() method Check size of map using size() Clear all elements of emp using clear() method Check whether map is empty using isEmpty() Explore Traversal methods 1.keySet() 2.values() 3.entrySet()\n\n");
		Map<Integer, String> employee = new HashMap<>();
		employee.put(1, "Abhi");		employee.put(2, "Ajay");
		employee.put(3, "Akash");		employee.put(4, "Bijay");
		employee.put(5, "Bikash");
		employee.putIfAbsent(6, "Binay");
		System.out.println(employee);
		Map<Integer, String> emp = new HashMap<>();
		emp.putAll(employee);
		System.out.println(emp);
		emp.remove(3);
		System.out.println("Is Sr no. 5 Employee Present: "+emp.containsKey(5));
		
		System.out.println("Is Employee 'Bijay' Present: "+emp.containsValue("Bijay"));
		
		System.out.println("Employee at key 1: "+emp.get(1));
		
		System.out.println("Size of Map: "+emp.size());
		
		System.out.println("Iterating through Keys");
		for(Integer i1: emp.keySet())
		{	System.out.println(i1);
		}
		System.out.println("Iterating through values");
		for(String s1 : emp.values())
		{System.out.println(s1);
		}
		System.out.println("Iterating through keys & values:");
		for(Entry<Integer,String> entry: emp.entrySet())
		{
			System.out.println(entry);
		}
		emp.clear();
		System.out.println("The Map is empty: "+emp.isEmpty());
	}

}
