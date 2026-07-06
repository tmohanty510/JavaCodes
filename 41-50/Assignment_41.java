package assignment_40_to_50;

public class Assignment_41 {
	public static int a = 23;
	protected static char b = 's';
	static boolean c = false;
	private static float d = 3.14f;
	
	public static void abc()
	{
		System.out.println("Public Method");
	}
	protected static void def()
	{
		System.out.println("Protected Method");
	}
	static void pqr()
	{
		System.out.println("Default/Package Method");
	}
	private static void xyz()
	{
		System.out.println("Private Method");
	}

	public static void main(String[] args) {
		System.out.println("Write a program to demonstrate access specifiers for variables and methods within the same class");
		System.out.println("\nPUBLIC int: " + a);
		System.out.println("PROTECTED char: " + b);
		System.out.println("DEFAULT/PACKAGE boolean: " + c);
		System.out.println("PRIVATE float: " + d);
		abc();
		def();
		pqr();
		xyz();
	}

}
