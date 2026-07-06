package assignment_51_to_60;

import java.util.Scanner;

public class Assignment_51 {

	public static void main(String[] args) {
		System.out.println("write a program to enter a String and iterate each character of string");
		
		System.out.println("Enter the String: ");
		Scanner s1 = new Scanner(System.in);
		String s= s1.next();
		
		for(int i=0; i< s.length(); i++)
		{
			System.out.print(s.charAt(i)+"   ");
		}
		
		

	}

}
