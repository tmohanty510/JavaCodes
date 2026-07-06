package assignment_81_to_90;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment_86 {
	public static void main(String[] args) {
		System.out.println("Perform the following operations: Create a HashMap of employee ID and employee name Add employee records using put() method Print all employee details Iterate all employee IDs using keySet() and for-each loop Iterate all employee names using values() and for-each loop Iterate all employee key-value pairs using entrySet() and for-each loop Iterate key-value pair using iterator()\n\n");
		Map<Integer,String> emp = new HashMap<>();
		emp.put(11, "Amar");
		emp.put(21, "Bijay");
		emp.put(31, "Charan");
		emp.put(41, "Digvesh");
		emp.put(51, "Gaurav");
		System.out.println("Employee Details: \n" + emp);
		System.out.println("Iterating through keys: ");
		
		for(Integer i1 : emp.keySet())
		{
			System.out.println(i1);
		}
		
		System.out.println("Iterating through values: ");
		
		for(String s1 : emp.values())
		{
			System.out.println(s1);
		}
		
		System.out.println("Iterating through both the pairs of keys & values: ");
		
		for( Entry<Integer, String> e1 : emp.entrySet())
		{
			System.out.println(e1);
		}
		
		Iterator<Entry<Integer,String>> i2 = emp.entrySet().iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
}
