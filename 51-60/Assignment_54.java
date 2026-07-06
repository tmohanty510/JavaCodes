package assignment_51_to_60;

public class Assignment_54 {

	public static void main(String[] args) {
		
		System.out.println("Write a Java program to demonstrate the matches(), replace(char, char), replace(CharSequence, CharSequence), and replaceAll(String, String) methods.");
		
		String s = "\n\nWelcome to the Earth\n";
		System.out.println(s);
		
		System.out.println(s.matches("W(.*)")); // .matches()
		
		System.out.println(s.matches("(.*)h")); // .matches()
		
		
		System.out.println(s.replace('E', 'e')); // .replace(char, char)
		
		System.out.println(s.replace("Ear", "Sat"));  // .replace(charSequence, charSequence)
		
		System.out.println(s.replaceAll("[a-z]", "1")); // .replaceAll(String, String)
		
		
	}

}
