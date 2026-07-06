package assignment_1_to_20;
public class Assignment_11 {
	public static void main(String[] args) {
		System.out.println( "WAP to find the largest of two numbers and check if it is even or odd\n");
		int a = 10;
		int b = 15;
		if(a>b)
		{
			System.out.println("\na is the largest of the two numbers = "+ a);
			if(a%2==0)
				System.out.println("\na is even");
			else
				System.out.println("\na is odd");
		}
		else {
			System.out.println("\nb is the largest of the two numbers = "+ b);
			if(b%2==0)
				System.out.println("\nb is even");
			else
				System.out.println("\nb is odd");
		}
	}
}
