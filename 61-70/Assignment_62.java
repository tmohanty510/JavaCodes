package assignment_61_to_70;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_62 {

	public static void main(String[] args) {
		System.out.println("WAP to enter a String Array and copy it to another Array(Use scanner class)");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the String Array: ");
		int l = sc.nextInt();		 // Length of the array needs to be same
		String a1[] = new String[l]; //1st Array
		String a2[] = new String[l]; //2nd Array
		
		System.out.println("Enter the contents of the array(Remember the size of the array is: "+ l);
		
		for(int i=0; i<l; i++)
		{
			a1[i]= sc.next();	//Entering values in array
		}
		
		System.out.println("The array you inserted is: ");
		System.out.println(Arrays.toString(a1));
	
		for(int i=0;i<l;i++)
		{
			a2[i] = a1[i];		//Logic for copying the arrays
		}
		
		System.out.println("The Copied array is: ");
		System.out.println(Arrays.toString(a2));

	}

}
