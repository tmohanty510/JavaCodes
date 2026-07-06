package assignment_36_40;

class GrandParent {
	GrandParent() 
    {
        System.out.println("GrandParent: Non-Parameterized");
    }
    GrandParent(int a) 
    {
        this(); // Internal chain
        System.out.println("GrandParent: Parameterized");
    }
}
class Parent extends GrandParent
	{
    Parent() {
        super(10); // Connecting to GrandParent
        System.out.println("Parent: Non-Parameterized");
    }
    Parent(String b) 
    {
        this(); // Internal chain
        System.out.println("Parent: Parameterized");
    }
}
class Child extends Parent 
{
    Child() {
        super("Hello"); // Connecting to Parent
        System.out.println("Child: Non-Parameterized");
    }
    Child(boolean c) {
        this(); // Internal chain
        System.out.println("Child: Parameterized");
    }
}

public class Assignment_38 {
    public static void main(String[] args) {
        System.out.println("write a program on combination of this calling statement and super calling statement in multilevel inheritance");
        new Child(true);
    }
}



























