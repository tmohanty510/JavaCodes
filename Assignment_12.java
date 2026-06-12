package assignment_1_to_20;

public class Assignment_12 {

public static void main(String[] args) {
	
	System.out.println("Write a program to check if a number is positive, negative, or zero"
			+ "If positive - check if it is even or odd"
			+ "if Negative - Check if it is Even or odd");
	
		int a = 11;
		
		if(a>0)
		{
			System.out.println("\na is positive and also");
			if(a%2==0)
			{
				System.out.println("a is even");
			}
			else
			{
				System.out.println("a is odd");
			}
		}
		
		else if(a==0)
		{
			System.out.println("a is zero");
		}
		else
		{
			System.out.println("\na is negative");
			if(a%2==0)
			{
				System.out.println(" a is even");
			}
			else
			{
				System.out.println(" a is odd");
			}
		}
		
		
}
	}

