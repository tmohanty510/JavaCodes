package assignment_35;

public class Person {
	
	static void P1() 
		{
		System.out.println("This is Static Method of Person Class");
		}
	void P2() 
		{
		System.out.println("This is Non-Static Method of Person Class");
		}
}


 class Teacher extends Person{
	 
	 static void T1() 
	 	{
		 System.out.println("This is Static Method of Teacher Class");	
	 	}
		void T2()
		{
			System.out.println("This is Non-Static Method of Teacher Class");	
		}
 }
 