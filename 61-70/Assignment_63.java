package assignment_61_to_70;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_63 {

	public static void main(String[] args) {
		System.out.println("WAP to enter an Array and copy to another array in reverse order");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the String Array: ");
		int l = sc.nextInt();		 // Length of the array needs to be same
		String a1[] = new String[l]; //1st Array
		String a2[] = new String[l]; //2nd Array
		
		System.out.println("Enter the contents of the array(Remember the size of the array is "+ l+"):");
		
		for(int i=0; i<l; i++)
		{
			a1[i]= sc.next();
		}
		
		System.out.println("The array you inserted is: ");
		System.out.println(Arrays.toString(a1));
		//here: i for a1 from back side, j for a2 from start
		for(int i=l-1,j=0;i>=0;i--,j++)
		{
			a2[j] = a1[i];
		}
		
		System.out.println("The Copied Reversed array is: ");
		System.out.println(Arrays.toString(a2));

	}

}
