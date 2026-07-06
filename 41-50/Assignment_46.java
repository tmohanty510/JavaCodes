package assignment_40_to_50;

abstract class A{
	abstract void Method1();			     //AM
	void Method2()
	{
		System.out.println("Real Logic 1");  //CM
	}
}

// Formula for Abstraction = (no of AM/no of CM)*50

//1 AM, 1 CM : (1/1)*50 = 50% Abstraction


public class Assignment_46 extends A{

	@Override
	void Method1() {
		System.out.println("Real Logic 2");   //CM
	}
	
	public static void main(String[] args) {
		System.out.println("write a program on 50% abstraction using class\n \n");
		Assignment_46 a1 = new Assignment_46();
		a1.Method1();
		a1.Method2();
	}

	

}
