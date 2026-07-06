package assignment_61_to_70;

public class Assignment_67 {

	public static void main(String[] args) {
		System.out.println("WAP to check if String only consist of alphabets");
		
		//String a = "Tanmay";
		String a = "Tanmay123";
		int d=0;
		char c [] = a.toCharArray();
		
		for(int i=0; i<a.length();i++)
		{
			boolean b = Character.isAlphabetic(c[i]);
			
		if(b)
		{
			d++;
		}
		}
		if(d==a.length())
		{
			System.out.println("Only Alphabets");
		}
		else {
			System.out.println("Not Only Alphabets");
		}


	}
}
