package assignment_71_to_80;

public class Assignment_72 {

	public static void main(String[] args) {
		System.out.println("WAP to demonstrate all the methods of StringBuffer Class. (capacity, append, replace, insert, reverse and delete)\n\n");
		
		StringBuffer s1 = new StringBuffer();
		//1. append()
		s1.append(10);
		s1.append(13); s1.append(14);
		s1.append(13); s1.append(14); s1.append(15);
		System.out.println("1. append():");
		System.out.println(s1);
		
		//2. capacity()
		System.out.println("\n2. capacity():");
		System.out.println(s1.capacity());
		
		//3. replace()
		System.out.println("\n3. replace():");
		s1.replace(2,7 , "1112");
		System.out.println(s1);
		
		//4. insert()
		System.out.println("\n4. insert():");
		s1.insert(11, "1617");
		System.out.println(s1);
		
		//5. delete
		System.out.println("\n5. delete():");
		System.out.println(s1.delete(11, 15));
		
		//6. reverse()
		System.out.println("\n6. reverse():");
		StringBuffer s2 = s1.reverse();
		System.out.println(s2);
	}

}
