package assignment_81_to_90;
import java.util.HashMap;
import java.util.Map;

public class Assignment_84 {

	public static void main(String[] args) {
		System.out.println("Write a program to demonstrate Map interface using different data types. Perform the following operations: Create Map using Integer and String Create Map using String and Double Create Map using Integer and Character Create Map using String and Boolean Add elements using put() Print all Maps\n\n");
		
		Map<Integer, String> m1 = new HashMap<Integer,String>();
		m1.put(1, "Krishna");
		m1.put(2, "Ram");
		m1.put(3, "Arjun");
		m1.put(4, "Laxman");
		System.out.println("\nInteger & String Map: "+m1);
		
		Map<String, Double> m2 = new HashMap<String, Double>();
		
		m2.put("Bharat", 5.45);
		m2.put("Bheem", 76.5);
		m2.put("Yudh", 22.38);
		System.out.println("\nString & Double Map: "+m2);
		
		Map<Integer, Character> m3 = new HashMap<Integer, Character>();
		
		m3.put(5, 'S');
		m3.put(6, 'T');
		m3.put(7, 'U');
		m3.put(8, 'V');
		System.out.println("\nInteger & Character Map: "+m3);
		
		Map<String, Boolean> m4 = new HashMap<String, Boolean>();
		m4.put("Tan", true);
		m4.put("Man", true);
		m4.put("Deb", false);
		m4.put("Kish", false);
		System.out.println("\nString & Boolean Map: "+m4);
	}

}
