package assignment_71_to_80;

public class Assignment_73 {

	public static void main(String[] args) {
		System.out.println("WAP to demonstrate all the methods of StringBuilder Class. (capacity, append, replace, insert, reverse and delete)\n\n");		
		StringBuilder s1 = new StringBuilder();
		//1. append()
		s1.append("Tanmay ");
		s1.append("Manish "); s1.append("Arjun ");
		s1.append("Vishal "); s1.append("Rajesh "); s1.append("Rajiv ");
		System.out.println("1. append():");
		System.out.println(s1);
		
		//2. capacity()
		System.out.println("\n2. capacity():");
		System.out.println(s1.capacity());
		
		//3. replace()
		System.out.println("\n3. replace():");
		s1.replace(27, 33, "Narayan");
		System.out.println(s1);
		
		//4. insert()
		System.out.println("\n4. insert():");
		s1.insert(14, "Souvik ");
		System.out.println(s1);
		
		//5. delete
		System.out.println("\n5. delete():");
		System.out.println(s1.delete(21, 25));
		
		//6. reverse()
		System.out.println("\n6. reverse():");
		StringBuilder s2 = s1.reverse();
		System.out.println(s2);
	}
}
