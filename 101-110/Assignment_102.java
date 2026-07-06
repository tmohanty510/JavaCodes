package assignment_101_to_110;
class A
{
	void M()
	{
		System.out.println("A- Hello World");
	}
}
class B extends A{
	void N()
	{
		System.out.println("B- Hi Earth");
	}
}

public class Assignment_102 extends B {
	public static void main(String[] args) {
		System.out.println("\"Write a Java program to demonstrate Upcasting and Downcasting (Class Type Casting)\"");
		
		System.out.println("\n\nUpcasting: Implict Way"); //Parent p = new child();
		B b1 = new Assignment_102(); //Implicit
		b1.M();
		b1.N();
		
		System.out.println("\nUpcasting: Explicit Way"); //Parent p = (Parent)new child();
		B b2 = (B) new Assignment_102(); //Explicit
		b2.M();
		b2.N();
		
		System.out.println("\n\n\n\n\nDowncasting: "); //child c = (child) p;
		Assignment_102 a1 = (Assignment_102) b1; //Explicit
		a1.M();
		a1.N();

	}

}
