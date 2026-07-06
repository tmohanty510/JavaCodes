 package assignment_101_to_110;

public class Assignment_101 {

	public static void main(String[] args) {
		System.out.println("\" Write a Java program to convert 1) byte into an int using widening primitive Typecasting. 2) long into byte using narrowing primitive Typecasting.\"");
		
		System.out.println("\n\n1.byto into int PTC: Widening");
		
		byte a = 11;
		int b = (int) a; //Explicit
		System.out.println(b);
		
		int c = a; //Implicit 
		System.out.println(c);
		
		System.out.println("\n2.long into byte PTC: Narrowing");
		
		long d = 540;
		byte e = (byte) d;//Explicit
		System.out.println(e);
		
		
		

	}

}
