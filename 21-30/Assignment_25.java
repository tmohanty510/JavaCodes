package Assignment_20_40;

import java.util.Scanner;

public class Assignment_25 {

	public static void main(String[] args) {
		System.out.println("Write a java program which takes 2 numbers a and b from user at run time and perform below operation:"
				+ "Please use methods from Math class, square root of a, maximum, minimum, a*b, a+b, a-b, Absolute value of a");
		System.out.println("Enter a & b: ");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println("The value of a="+ a+ "\nThe value of b="+ b);
		double sqrt = Math.sqrt(a);
		System.out.println("Square root = "+ sqrt);
		int max = Math.max(a, b);
		System.out.println("Maximum = "+ max);
		int min = Math.min(a, b);
		System.out.println("Minimum = "+ min);
		int mul = Math.multiplyExact(a, b);
		System.out.println("Multiplication Result = "+ mul);
		int add = Math.addExact(a, b);
		System.out.println("Addition Result = "+ add);
		int sub = Math.subtractExact(a, b);
		System.out.println("Substraction Result = "+ sub);
		int abs = Math.abs(a);
		System.out.println("Absloute Value of a is = "+ abs);
		
	}

}
