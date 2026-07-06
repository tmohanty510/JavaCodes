package assignment_51_to_60;

public class Assignment_53 {

	public static void main(String[] args) {
		System.out.println("WAP to check if a string is Palindrome or not\n");
				String input =	"tanmay"; String input1 =	"malayalam";
				
				String reverse=""; String reverse1="";
				
				for(int i=input.length()-1;i>=0;i--)
				{
					char c1 = input.charAt(i);
					reverse = reverse+c1;	
				}
				System.out.println("This is your input: " + input);
				System.out.println("This is your output: " + reverse);
				
				if(input.equals(reverse))
					System.out.println("It is a Palindrome");
				else
					System.out.println("It is NOT a Palindrome");
				
				for(int i=input1.length()-1;i>=0;i--)
				{
					char c1 = input1.charAt(i);
					reverse1 = reverse1+c1;	
				}
				System.out.println("\n\nThis is your input: " + input1);
				System.out.println("This is your output: " + reverse1);
				
				if(input1.equals(reverse1))
					System.out.println("It is a Palindrome");
				else
					System.out.println("It is Not a Palindrome");
	}
}
