package Assignment_20_40;

public class Assignment_23 {

	
	static void add(int a, int b)		//Method 1
	{
		int sum1 = a+b;
		System.out.println("Method 1, " + "a+b="+sum1);
	}
	
	void add(int a, double b)			//Method 2
	{
		double sum2= a+b;
		System.out.println("\nMethod 2, " + "a+b="+sum2);
	}
	
	Assignment_23()						//Constructor 1
	{
		System.out.println("\nCon 1");
	}
	
	Assignment_23(int a)				//Constructor 2
	{
		System.out.println("\nCon 2");
	}
	
	public static void main(String[] args)			//Main Method
	{
		add(2,7);									//Calling static method
		Assignment_23 a1 = new Assignment_23();		//Object created, Constructors(without Argument)get called automatically
		a1.add(2, 9.2);								//Calling Non-Static method
		new Assignment_23(4);						//Constructor 2 with argument gets called here
	}
													//Order of execution will be: add, c1, add, c2
}
