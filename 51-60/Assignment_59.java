package assignment_51_to_60;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_59 {

	public static void main(String[] args) {
		System.out.println("Write a program to accept the values (using Scanner Class) of an Array in the runtime of int and String type. Take the size input from the user.");
		
		System.out.println("\n\nEnter size of the Array:");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		System.out.println("\nEnter the values of the Array");
		String a[] = new String[size];
		for(int i=0; i<size;i++)
		{
			a[i] = sc.next();
		}
		System.out.println("\nSize od the Array is: "+ size);
		System.out.println("\nThe Array you created is: "+ Arrays.toString(a));

	}

}
