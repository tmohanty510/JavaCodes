package assignment_1_to_20;

public class Assignment_22 {

	public static void main(String[] args) {
	
		System.out.println("If marks ≥ 35 Print “Pass” If marks ≥ 75 → “Distinction” Else if marks ≥ 60 → “First Class” Else → “Second Class” Else → “Fail”");
		
		int mark= 110;
		int num=1;
		
		if(mark<=100 && mark>0)
		{
		switch(num)
		{
		
		case 1:
			if(mark>=75)
			{
				System.out.println("Your Score: "+mark);
			System.out.println("Distinction Pass");
			}
			
		case 2:
			if(mark>=60 && mark<75)
			{
				System.out.println("Your Score: "+mark);
				System.out.println("First Class Pass");
			}
			else if(mark<=59 && mark>=35)
			{
				System.out.println("Your Score: "+mark);
				System.out.println("Second Class");
			}
		
		case 3:
			if(mark<35)
			{
				System.out.println("Your Score: "+mark);
				System.out.println("Fail");
			}
		}
		}
		
		else {
			System.out.println("The Mark you entered is: "+ mark+ "\nSo it's an Invalid Score");
			System.out.println("Please Enter the "
					+ "score between 0 and 100");
			}
	}
}

















