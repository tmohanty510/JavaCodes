package assignment_40_to_50;

class G{								//GrandParent Class
	void name(String n) {				//Concrete Method
		System.out.println("Manish");
	}
}

abstract class P extends G{				//Parent Abstract Class
	abstract void add(int a,int b);		//Abstract Method
}

public class Assignment_47 extends P{	//Child Class

	public static void main(String[] args) {	//Main Method
		System.out.println("write a program on Concrete grand parent class. abstract parent class extends grand parent class.\r\n"
				+ "create abstract void add(int a,int b) method in it.\r\n"
				+ "concrete child class extends abstract parent class.(multilevel inheritance.)\r\n"
				+ " call all methods inside child class main method. \n\n\n");

		Assignment_47 a2 = new Assignment_47();	//Obj creation
		
		a2.name("Hello");	//calling GrandParent's Concrete Method	
		a2.add(3, 5);		// Calling Parent's Abstract Method
		
	}

	@Override
	void add(int a, int b) {		//Implimenting Abstract Method
		
		int add = a+b;
		System.out.println(add);
		
		
		
	}

}
