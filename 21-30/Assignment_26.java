package Assignment_20_40;

public class Assignment_26 {

	public static void main(String[] args) {
		System.out.println("Write a program to call method and constructor from assignment 23");
		
		Assignment_23 a1 = new Assignment_23(); //con1 gets called
		
		a1.add(12, 4); //method 1 gets called
		a1.add(6, 8); //method 2 gets called
		
		new Assignment_23(5);	// con2 gets called
		
		// Flow of the Output: c1, m1, m2, c2
		
	}

}
