package Assignment_20_40;

import java.util.Scanner;

public class Assignment_29 {

	public static void main(String[] args) {
		System.out.println("WAP using for loop to 1) print number 1 to n2) print even number between 0 to n 3) print odd numbers between 1 to n 4) print sum of first n numbers 5) write multiplication table of n........Here enter value of  n at run time");
		System.out.println("Enter the value of 'n':");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.printf("1. Printing 1 to %d: ", n );
		for(int i=1; i<=n ; i++)
		{
			System.out.print(i +",");		
		}
		System.out.printf("\n2. Printing Even numbers between 1 to %d: ", n );
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.print(i + ",");
			}
		}
		System.out.printf("\n3. Printing Odd numbers between 1 to %d: ", n );
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0)
			{
				System.out.print(i +",");
			}
		}
		int sum = 0;
		for(int i=0; i<=n; i++)
		{
			sum = sum + i;
		}
		System.out.printf("\n4. Sum of the numbers from 1 to %d: %d " , n, sum);
		System.out.printf("\n5. Multiplication Table for %d: \n \n" , n);
		for(int i=1; i<=10; i++)
		{
					System.out.print(n + " × ");
					System.out.print(i + " = ");
					System.out.print(i*n + " ");
					System.out.println("\n");
		}
	}
}
