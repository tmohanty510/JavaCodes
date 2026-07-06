package assignment_40_to_50;

import assignment_35.Assignment_SuperClass;

public class Assignment_43 extends Assignment_SuperClass {

	public static void main(String[] args) {
		 System.out.println("Write a program to demonstrate access specifiers for methods and variables outside the package by becoming subclass\n \n\n");
		 Assignment_43 s = new Assignment_43(); 
		 
		 System.out.println(s.a);//public
		 int k= s.b; //protected
		 //default and private variables are inaccessible
		 
		 s.M1();	// public
		 s.M2("Hello"); //protected
		 //default and private Methods are inaccessible
		 
		 //Public and Protected variable & Methods can be accessible outside the package by becoming the subclass 
		 

	}

}
