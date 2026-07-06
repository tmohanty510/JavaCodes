package package_GTM_Assignment_Inheritance_Levels;
public class Assignment_32_C2 extends Assignment_32_C1 {
	static void M2()
	{
		System.out.println("This is Child Class's Static Method");
	}
	void M2(char c)
	{
		System.out.println("This is Child Class's Non-Static Method");
	}
	public static void main(String[] args) {
		M1(1);	M2();
		Assignment_32_C2 a = new Assignment_32_C2();
		a.M1();	a.M2('d');	
	}
}
