package Assignment_20_40;
public class Assignment_27 {
	static int a ;				//Static Global Variable Declaration
	static int b = 20;			//Static Global Variable Declaration & Initialization
	int c; 						//Instance Variable Declaration(Non-Static Global Variable)
	int d = 30; 				//Instance Variable Declaration & Initialization(Non-Static Global Variable)
	public static void main(String[] args) {
		System.out.println("Write a java program on local variable,static global variable,non static global variable(instance variable) now write a method to display original  values of local,global and instance variable. update the values and print as well" );
		display();				//Calling Display Method
	}
	public void tanmay()
	{
		
	}
	public static void display()
	{	
		Assignment_27 a1= new Assignment_27();										//Object Creation for Instance Variables
		System.out.println("\n\n\nDef Value of 'a'(No Ini Done) Stat Global Var 'a' = " + a); 			//Calls and Prints Default Value of the Static Global Variable 'a' 
		
		a = 62;																		//Updating the value of 'a' Static Global Variable
		
		System.out.println("Updated Value of Static Global Variable 'a' = " + a); 	//Calls and Prints the Updated Value of Static Global Variable 'a' 
									
		
		//Here We'll create a duplicate variable... Same Local Var name as Global Var
		
		int a;																		//Local Variable Declaration
		a = 2;	 																	//Local Variable Initialization
		
		System.out.println("\nLocal Variable 'a'= " + a);							//Prints Local Variable 'a'
		
		System.out.println("\nDef Value of 'c'(No Ini Done) Instance Variable 'c' = " + a1.c);			//Prints default value of 'c' Instance Variable
		a1.c = 24;																	//Updating the value of 'c' Instance Variable
		System.out.println("Updated Value of 'c' = " + a1.c);						//Printing the Updated Value of 'c' Instance Variable
		
		System.out.print("\nValue of 'd' = " + a1.d);									//Prints default value of 'd' Instance Variable
		a1.d = 44;																	//Updating the value of 'd' Instance Variable
		System.out.print("\nUpdated Value of 'd' = " + a1.d);							//Prints the Updated value of 'd' Instance Variable
	}

}
