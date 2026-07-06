package assignment_81_to_90;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment_89 {
	public static void main(String[] args) {
		
		System.out.println("Write a java program using finally\n\n");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter the size of the array: ");
			int size = sc.nextInt();
			int a[] = new int [size];
			System.out.println("\nEntering elements to the array of type 'int'.\n\n");
			for(int i=0; i<=size;i++)
			{
				System.out.println("Enter the elements of the array at index: "+i+"-");
				a[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(a));	
		}

		catch(NegativeArraySizeException c1)
		{
			System.out.println("\nException: Please Enter a positive value as array size");
		}
		catch(ArrayIndexOutOfBoundsException c2)
		{
			System.out.println("Exception: Arrays Index is Invalid");
		}
		catch(InputMismatchException c3)
		{
			System.out.println("Exception: Kindly enter only int values");
		}
		finally
		{
			System.out.println("\n\nFinally: this is finally block. This will execute always");
		}
	}

}
