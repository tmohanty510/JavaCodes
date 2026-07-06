package assignment_40_to_50;

interface Hello{				//Interface 1
	void add(int a, int b);		//Abstract Method 1
}

interface World{				//Interface 2
	void sub(int a, int b);		//Abstract Method 2
}
public class Assignment_49 implements Hello, World { 
		//1 class having relationship with Multiple Interfaces
	public static void main(String[] args) {
	System.out.println("Write a program on multiple level inheritance using interface\n\n");
	Assignment_49 a1 = new Assignment_49();	//Obj Creation
	a1.add(6, 9);			
	a1.sub(8, 3);
	
	}
	
	//Implementation of Abstract Methods
	@Override
	public void sub(int a, int b) {
		int sub = a-b;
		System.out.println(sub);
	}

	@Override
	public void add(int a, int b) {
		int add = a+b;
		System.out.println(add);
	}

}
