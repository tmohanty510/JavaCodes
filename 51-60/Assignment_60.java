package assignment_51_to_60;

public class Assignment_60 {

	public static void main(String[] args) {
		System.out.println("WAP print Output in following format: 1 Student: My Name is:->Ram My Initial is->A My rollNo is ->11 2 Student: My Name is:->Sham My Initial is->W My rollNo is ->53 3 Student: My Name is:->Hari My Initial is->P My rollNo is ->40\n\n");

		String serial[] = {"1st Student- ", "2nd Student- ", "3rd Student- "};
		String name[] = {"Ram", "Sham","Hari"};
		int roll[] = {11, 53, 40};
		
		char ini[] = {'A','W','P'};
		
		for(int i=0; i<name.length;i++)
		{
		System.out.println(serial[i]+"My name is: "+ name[i]
				+", My initial is: "+ini[i]+", My rollno is: "+roll[i]+".\n");
		}
	}

}
