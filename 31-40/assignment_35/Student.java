package assignment_35;

class Student extends Person{
	
	 static void S1() 
	 	{
		 System.out.println("This is Static Method of Student Class");
		}
	 
		void S2() 
		{
			System.out.println("This is Non-Static Method of Student Class");
		}
	 
		
	 public static void main(String[] args) {
	
		P1();
		Person p = new Person();
		p.P2();
		S1();
		Student s = new Student();
		s.S2();
	}
	
}

