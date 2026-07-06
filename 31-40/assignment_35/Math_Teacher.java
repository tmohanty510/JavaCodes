package assignment_35;

public class Math_Teacher extends Teacher{
	
	 static void MT1() 
			 	{
		 System.out.println("This is Static Method of Math Teacher Class");
				}
			 
		void MT2()
				{
		System.out.println("This is Non-Static Method of Math Teacher Class");	
				}
				
		public static void main(String[] args) {	
			P1();
			Math_Teacher p = new Math_Teacher();
			p.P2(); 
			T1();	
			Teacher t = new Teacher();
			t.T2();
			MT1();
			Math_Teacher m = new Math_Teacher(); m.MT2();
				}

}
