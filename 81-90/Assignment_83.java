package assignment_81_to_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment_83 {

	public static void main(String[] args) {
		System.out.println("\"Write a program to demonstrate ArrayList<String>. Perform the following operations: 1.Create an ArrayList of employee names 2.Add 5 employee names 3.Print all names 4.Sort names alphabetically ( use Collections class methods here ) 5.Reverse the names 6.Check whether a particular employee name is present using contains() 7.shuffle names in random order  ( shuffle() method ) Create one more collection with salary find maximum salary find minimum salary\"\n\n");
		
		List<String> emp = new ArrayList<>(Arrays.asList("Tanmay","Manish","Vishal","Rajiv","Souvik"));
		
		System.out.println("The names of the Employees are: "+emp);
		
		Collections.sort(emp);
		System.out.println("\nSorting their names Alphabetically: "+emp);
		
		Collections.reverse(emp);
		System.out.println("\nReversing their order: "+emp);
		
		System.out.println("\nDeb is present: "+emp.contains("Deb"));
		
		Collections.shuffle(emp);
		System.out.println("\nShuffling their order: "+emp);
		
		List<Float> salary = new ArrayList<>(Arrays.asList(30f,34f,40f,25f,42f));
		
		System.out.println("\nMaximum Salary: "+Collections.max(salary));
		
		System.out.println("\nMinimum Salary: "+Collections.min(salary));
		
		
		

	}

}
