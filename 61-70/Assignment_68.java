package assignment_61_to_70;

public class Assignment_68 {

	public static void main(String[] args) {
		System.out.println("WAP to check a String consists of how many alphabets, numeric values, spaces and special characters.\n\n");
		
		int alp=0, num=0, spa=0, spe=0;
		String a = "/Tanmay@ 123 /";
		char[] ch = a.toCharArray() ;
		
		for(int i=0; i<a.length(); i++)
		{
			boolean b = Character.isAlphabetic(ch[i]);
			boolean c = Character.isDigit(ch[i]);
			boolean d = Character.isWhitespace(ch[i]);
			if(b)
			{
				alp++;
			}
			else if(c)
			{
				num++;
			}
			else if(d)
			{
				spa++;
			}
			else {
				spe++;
			}
		}
		
		System.out.println("The String "+a+" consists of: "+alp+" Alphabets, "+num+" Numbers, "+spa+" Spaces," +spe+" Special Characters");
		
		

	}

}
