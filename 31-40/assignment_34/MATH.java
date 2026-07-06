package assignment_34;

public class MATH extends SUBJECT {
	static void Eng1()
	{
		System.out.println("This is Static Method of Math Class");
	}
	void Eng2()
	{
		System.out.println("This is Non-Static Method of Math Class");
	}
	public static void main(String[] args) {
		sub1();
		SUBJECT a = new SUBJECT();
		a.sub2();
	}

}
