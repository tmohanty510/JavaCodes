package Assignment_20_40;

import java.util.Scanner;

public class Assignment_24_Scanner {

	public static void main(String[] args) {
		System.out.println("\"Write a java program that takes user input using Scanner\r\n"
				+ "\r\n"
				+ "Student name:\r\n"
				+ "age:\r\n"
				+ "marks of 3 subjects : sub1,sub2,sub3\r\n"
				+ "Now calculate the total marks and average. \r\n"
				+ "Print all the output "
				+ "\n____________________________________________");
		Scanner s1 = new Scanner(System.in);
		System.out.println("\n\n\nEnter name of the student:");
		String name = s1.next();
		System.out.println("Enter age of the student:");
		int age = s1.nextInt();
		System.out.println("Enter the marks of the three subjects:"+"\n");
		int sub1 = s1.nextInt();
		int sub2 = s1.nextInt();
		int sub3 = s1.nextInt();
		
		int total = sub1+sub2+sub3;
		double avg = total/3;
		System.out.println("Name of the student is:"+ name + "\nAge:"+ age + 
		"\nMarks in the three subjects:"+ sub1+", "+sub2+", "+sub3+", "+ 
				"\nTotal Marks:"+ total+ ", Average:"+ avg);
	}

}
