package assignment_81_to_90;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_87 {

	public static void main(String[] args) {
		System.out.println("Write a program to demonstrate runtime exception (unchecked exception) using arrays-->one try and one catch block ex:NegativeArraySizeException");
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter the size of the array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("\nNow enter the contents of the array one after another: ");
		
		for(int i=0; i<size;i++)
		{
			System.out.println("\nEnter the value at index position: "+i);
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		sc.close();
		}
		catch(NegativeArraySizeException c1)
		{
			System.out.println("\n\nPlease Enter a positive value as size");
		}
		

	}

}
