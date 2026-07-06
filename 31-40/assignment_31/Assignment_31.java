package Assignment_20_40;

import java.util.Scanner;

public class Assignment_31 {

	public static void main(String[] args) {
		 System.out.println("WAP  to generate fibonacci series of first n numbers");
		 
		 //Fibonacci Series is 0,1,1,2,3,5,8,13,21,34

		 System.out.println("Enter n: \n");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int a = 0;
		 int b = 1;
		 System.out.println("The fibonacci series till n: \n");
		 System.out.print(a + " ");
		 System.out.print(b + " ");
		 for(int i=1; i<=n-2; i++)
		 {
			int sum = a+b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		 }
	}
}


