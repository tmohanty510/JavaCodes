package assignment_61_to_70;

import java.util.Date;

public class Assignment_69 {

	public static void main(String[] args) {
		System.out.println("WAP to print Current time using Date class\n\n");
		
		Date d1 = new Date();
		System.out.println("This is epoch time: \n"+d1.getTime()+"\n\n");
		
		Date d2 = new Date(d1.getTime()) ;
		System.out.println("Current Time is: \n"+d2);
		

	}

}
