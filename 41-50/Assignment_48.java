package assignment_40_to_50;

interface I								//INTERFACE
{
	void add(int a, int b);				//(ABSTRACT)METHODS OF INTERFACE
	void sub(int a, int b);
}


public class Assignment_48 implements I{	//CHILD CLASS IMPLEMENTS INTERFACE

	public static void main(String[] args) {	//MAIN METHOD
		System.out.println("Create an interface with 2 methods add(int a, int b) and sub(int a ,int b).\r\n"
				+ "Implement these methods in a class and display result\n \n");
		
		
		Assignment_48 a3 = new Assignment_48();  //Obj Creation
		
		a3.add(4, 9);			//Calling the Methods of Interface
		a3.sub(8, 31);

	}

	@Override
	public void add(int a, int b) {		//Implementing Method 1
		int add = a+b;
		System.out.println(add);
		
	}

	@Override
	public void sub(int a, int b) {		//Implementing Method 2
		int sub = a-b;
		System.out.println(sub);
		
	}

}
