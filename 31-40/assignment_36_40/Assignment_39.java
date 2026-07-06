package assignment_36_40;

class Hello
{
	void abc()
	{
		System.out.println("Parent Class's Method");
	}
}

public class Assignment_39 extends Hello{
	
	void abc()
	{
		System.out.println("\nChild Class's Method");	
	}
	
	public static void main(String[] args) {
		System.out.println("Write a program to demonstrate method overriding");
		Assignment_39 a1 = new Assignment_39(); 
		a1.abc();		//Child Class's method abc() overrides/replaces Parent Class's method abc()
	}
}
