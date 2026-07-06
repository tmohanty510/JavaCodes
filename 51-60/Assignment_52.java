package assignment_51_to_60;

import java.util.Scanner;

public class Assignment_52 {

	public static void main(String[] args) {
		System.out.println("write a program to reverse a String");
		
		System.out.println("Enter the String: ");
		Scanner s1 = new Scanner(System.in);
		String s= s1.next();
		String reverse = "";
		for(int i= s.length()-1; i>=0;i--)
		{
			char c = s.charAt(i);
			reverse = reverse + c;
		}
		System.out.println(reverse);
	}

}
