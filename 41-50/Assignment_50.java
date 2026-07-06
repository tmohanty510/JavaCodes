package assignment_40_to_50;
public class Assignment_50 {
	public static void main(String[] args) {
		System.out.println("Write a program to enter a String and use the following methods: 1. length() 2. concat() 3. equals() 4. contains() 5. equalsIgnoreCase() 6. substring(int beginIndex) 7. substring(int beginIndex, int endIndex) 8. trim() 9. charAt() 10. indexOf()\n\n\n");

		String s = "Tanmay";
		String s1 = "   Java   ";
		System.out.println(s.length());
		System.out.println(s1.length());
		
		System.out.println(s.concat(" Mohanty"));
		System.out.println(s1.concat("Automation"));
		
		System.out.println(s.equals("tanmay"));
		System.out.println(s1.equals("java"));
		
		System.out.println(s.contains("nmay"));
		System.out.println(s1.contains("av"));
		
		System.out.println(s.equalsIgnoreCase("taNMay"));
		System.out.println(s1.equalsIgnoreCase("jaVa"));
		
		System.out.println(s.substring(4));
		System.out.println(s1.substring(2));
		
		System.out.println(s.substring(1, 6));
		System.out.println(s1.substring(1, 3));
		
		System.out.println(s1.trim());
		
		System.out.println(s.charAt(5));
		System.out.println(s1.charAt(3));
		
		System.out.println(s.indexOf('a'));
		System.out.println(s1.indexOf('v'));
	}
}
