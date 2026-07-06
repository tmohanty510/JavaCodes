package assignment_61_to_70;

import java.util.Scanner;

public class Assignment_61 {

	public static void main(String[] args) {
		System.out.println("WAP to  take name and roll number at run time (Scanner class) and print Output in following format: 1 Student: My Name is:->Ram My Initial is->A My rollNo is ->11 2 Student: My Name is:->Sham My Initial is->W My rollNo is ->53 3 Student: My Name is:->Hari My Initial is->P My rollNo is ->40");
		Scanner sc = new Scanner(System.in);
		int no_of_students=3;
		String name;
		String initial;
		int serial=0, roll=0;
		for(int i=0; i<no_of_students; i++)
		{
		System.out.println("Enter Serial No. of the student: ");
		serial = sc.nextInt();
		System.out.println("Enter Name of the student: ");
		name = sc.next();
	
		System.out.println("Enter Initial of the student: ");
		initial = sc.next();
		System.out.println("Enter Roll no. of the student: ");
		roll = sc.nextInt();
		
		System.out.println(serial +") My name is: " +name+ 
		". My Initial is: " + initial + " & My Roll No. is: " + roll);
		System.out.println();
		}
		
		
		
	}
	


}
