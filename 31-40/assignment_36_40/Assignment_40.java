package assignment_36_40;

class Amazon
{
	void Login()
	{
		System.out.println("Parent Class's Method");
	}
}

public class Assignment_40 extends Amazon{
	
	void Login()
	{
		super.Login();
		System.out.println("Child Class's Method");		
	}

	public static void main(String[] args) {
		System.out.println("write a program to call parent class method together with child class method in case of method overriding");
		Assignment_40 a1 = new Assignment_40();
		a1.Login();
	}

}
