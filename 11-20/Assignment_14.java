package assignment_1_to_20;
public class Assignment_14 {
	public static void main(String[] args) {
		System.out.println("Write a Java program to validate a user login system using nested if-else statements"
				+"If the username is correct"
				+"Then check the password If password is correct - print Login successful"
				+"Else - print Incorrect password"
				+"Else - print"+"Invalid username");
		String username = "tanmay";
		String password = "2026";
		
		if(username=="tanmay")
		{	System.out.println("\nThe username is correct");
			if(password== "2026")
				{		System.out.println("Login Successful");
				}
				else {	System.out.println("Incorrect Password");
					}}
		else
		{System.out.println("\nThe username is invalid");
		}
	}
}
