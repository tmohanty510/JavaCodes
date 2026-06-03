package assignment_1_to_20;

public class Assignment_13 {

	public static void main(String[] args) {
		
		System.out.println("\"Take age as input:\r\n"
				+ "\r\n"
				+ "If age ≥ 18 - check if age ≥ 60 (senior citizen)\r\n"
				+ "Else - print not eligible to vote\"");
		
		int age=63;
		
		System.out.println("\nYour Age is = "+ age);
		
		if(age>=18)
		{
			System.out.println("So you are 'Eligible to vote'.");
			if(age>=60)
			{
				System.out.println("And also you are a Senior Citizen");
			}
		}
		else {
			System.out.println("SO you are 'Not Eligible to vote'.");
		}
		

	}

}
