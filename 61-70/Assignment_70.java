package assignment_61_to_70;

import java.util.Date;

public class Assignment_70 {

	public static void main(String[] args) {
		System.out.println("WAP to print the date 5 days in the Past and 17 days in future time \n\n");
		
		Date d1 = new Date();
		System.out.println("Yhis is Epoch time: "+d1.getTime()+"\n");
		
		Date d2 = new Date(d1.getTime()-1000*60*60*24*5l);	//Before 5 days- Past Time
		System.out.println("This is 5 days before time: \n"+d2+"\n");;
		
		Date d3 = new Date(d1.getTime()+1000*60*60*24*17l); //After 17 days- Future Time
		System.out.println("This is 17 days after time: \n"+d3);;
		
	}

}
