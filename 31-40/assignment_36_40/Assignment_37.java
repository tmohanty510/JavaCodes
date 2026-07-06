package assignment_36_40;
class GrandParent1 {
	GrandParent1() {
		System.out.println("GrandParent: Non-Parameterized");
	}
	GrandParent1(int a) {
		this();
		System.out.println("GrandParent: Parameterized");
	}
}
class Parent1 {
	Parent1() {
		System.out.println("Parent: Non-Parameterized");
	}

	Parent1(String s) {
		this(); 
		System.out.println("Parent: Parameterized");
	}
}
class Child1 {
	Child1() {
		System.out.println("Child: Non-Parameterized");
	}

	Child1(double d) {
		this(); 
		System.out.println("Child: Parameterized");
	}
}
public class Assignment_37 {
	public static void main(String[] args) {
		System.out.println("write a program on constructor chaining using this calling statement");
		new GrandParent1(10);
		new Parent1("Java");
		new Child1(99.9);
	}
}
