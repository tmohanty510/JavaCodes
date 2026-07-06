package Assignment_20_40;

public class Assignment_20 {	

	static void Login(String email) {
		if(email.endsWith("gmail.com"))
		{
			System.out.println("It is a Valid Email");
		}	
		else {
		System.out.println("It is an invalid Email");
			}
		}
	static void Login(String email, String password) {
		if((password.length()>6) && (email.endsWith("gmail.com")))
		{
			System.out.println("It is a Valid Email and a Valid Password");
		}
		else {
			System.out.println("It is an Invalid Email and an Invalid Password");
		}
	}
	static void Login(String email, String password, String otp) {
		if(otp.length()>4 && password.length()>6 && email.endsWith("gmail.com"))
		{
			System.out.println("The Email, Password and OTP all are VALID");
		}
		else {
			System.out.println("The Email, Password and OTP all are INVALID");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("\"Write a Java program demonstrating method overloading for a login system.\r\n"
				+ "The program should have three overloaded Login methods:\r\n");
		Login("hi@gmail.com");
		Login("hi@gmail.com" , "hellothere");
		Login("hi@gmail.com" , "hellothere" , "12345");	
	}
}
