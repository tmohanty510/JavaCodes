package assignment_51_to_60;

import java.util.Scanner;

public class Assignment_55 {

	public static void main(String[] args) {
		System.out.println("WAP to enter a String using Scanner class and iterate using Array");
		
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char[] c = s.toCharArray(); 
		
		for(int i=0; i<= c.length-1 ; i++)
		{
			System.out.println(c[i]);
		}

	}

}
