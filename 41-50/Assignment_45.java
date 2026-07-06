package assignment_40_to_50;

abstract class Abc{
	abstract void Method1();	//AM
	abstract void Method2();	//AM
}

//Formula for Abstraction = (no of AM/no of CM)*50

//1 AM, 1 CM : (2/1)*50 = 2*50 = 100% Abstraction

public class Assignment_45 extends Abc {

	@Override
	void Method1() {
		System.out.println("AM1 Real Logic 1"); //AM1 Implementation
		
	}

	@Override
	void Method2() {
		System.out.println("AM2 Real Logic 2"); //AM2 Implementation
		
	}
public static void main(String[] args) {
		
		System.out.println("write a program on 100% abstraction using class\n\n");
		Assignment_45 a1 = new Assignment_45();
		
		a1.Method1(); 	//Calling M1
		a1.Method2();	//Calling M2
	}


}
