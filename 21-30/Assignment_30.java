package Assignment_20_40;

import java.util.Scanner;

public class Assignment_30 {

	public static void main(String[] args) {
			System.out.println("WAP to find the factorial of given number n at run time");
			
			System.out.println("Enter the number:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int f = 1;
			for(int i=1; i<=n; i++)
			{
				f = f * i;
			}
			System.out.printf("The factorial of number %d = %d ", n , f);
	}

}
