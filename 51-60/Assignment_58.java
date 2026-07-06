package assignment_51_to_60;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_58 {

	public static void main(String[] args) {
		System.out.println("Write a program to accept the values (using Scanner Class) of an Array in the runtime of int and String type.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter the values of the Array of String data type:");
		String name [] = new String[5];
		
		for(int i =0; i<name.length;i++)
		{
			name[i] = sc.next();
		}
		System.out.println("String Array: "+ Arrays.toString(name));
		
		System.out.println("Enter the values of the Array of int type");
		int roll [] = new int[5];
		
		for(int i =0; i<name.length;i++)
		{
			roll[i] = sc.nextInt();
		}
		System.out.println("int Array: "+ Arrays.toString(roll)+"\n");				
				
		for(int i=0;i<roll.length;i++)
		{
			System.out.println("My Name is: "+name[i]+" and My rollNo is: "+roll[i]);
		}
				
		
		sc.close();
	}

	
}
