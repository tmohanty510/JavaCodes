package Assignment_20_40;

public class Assignment_21 {

	static void validateScore(int score)
	{
		System.out.println("\nMethod 1");
		System.out.println("~~~~~~~~~~~~");
		if((score>0) && score<=100)
			{
				System.out.println("Your Score is: "+ score);
				System.out.println("It's a Valid Score.");
			}
		else {
			System.out.println("Your Score is: "+ score);
			System.out.println("It's a Invalid Score");
		}
	}
	
	void validateScore(int score, int passingScore)
	{
		System.out.println("\n\nMethod 2");
		System.out.println("~~~~~~~~~~~~");
		if(score>= passingScore)
		{
			System.out.println("Your Score is: "+ score);
			System.out.println("Congratulations! You Passed");
		}
		else {
			System.out.println("Your Score is: "+ score);
			System.out.println("\nBetter luck next time");
		}
	}
	
	
	void validateScore(int  score, int passingScore, boolean isBonus)
	{
		System.out.println("\n\nMethod 3");
		System.out.println("~~~~~~~~~~~~");
		
		if(score>= passingScore) 
		{
			if(score>=80) 
			{
				isBonus= true;
			}
				if(isBonus== true)
				{
					System.out.println("Your Score is: "+ score);
					System.out.println("Student is Excellent.");
				}
				else {
			System.out.println("\nStudent is not Excellent.");
				}
		}
	}	
	
	
	public static void main(String[] args) {
	
		System.out.println("Write a Java program to demonstrate method overloading using a validateScore method");
				validateScore(78);
				Assignment_21 vs = new Assignment_21();
				vs.validateScore(72, 38);
				vs.validateScore(82, 38, true);	
	}
}

