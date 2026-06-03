package assignment_1_to_20;
public class Assignment_19_Smart_Calculator {
	static void calculate(int a,int b)
	{
		int sum1 = a+b;
		System.out.println("Result sum of two numbers= "+ sum1);
	}
	static void calculate(int a, int b, int c)
	{
		int sum2= a+b+c;
		System.out.println("Result sum of three numbers= "+ sum2);
	}
	static void calculate(double a, double b)
	{
		double mul= a*b;
		System.out.println("Result multiplication of two numbers= "+ mul);
	}
	static void calculate(int a, double b)
	{
		double sub= a-b;
		System.out.println("Result substraction of two numbers= "+ sub);
	}
	public static void main(String[] args) {
		System.out.println("\"Create a class SmartCalculator with overloaded methods:\r\n"+ "calculate(int a, int b)addition\r\n"+ "calculate(int a, int b, int c)addition of 3 numbers:calculate(double a, double b)multiplication\r\n"+ "calculate(int a, double b)subtraction\r\n");	
		calculate(18, 5);
		calculate(12, 9, 4);
		calculate(2.6, 6.4);
		calculate(54, 3.9);
	}
}
