package assignment_61_to_70;

import java.util.Arrays;

public class Assignment_66 {

	public static void main(String[] args) {
		System.out.println("WAP to check if 2 Strings are Anagram \n\n");
		
		String a = "TASC";
		//String b = "CAST";
		String b = "STAK";
		boolean k= false;
		char ac[] = a.toCharArray();
		char bc[] = b.toCharArray();
		
		Arrays.sort(ac);
		Arrays.sort(bc);
		
		for(int i=0; i<a.length(); i++)
		{
			k = Arrays.equals(ac, bc);
		}
		if(k)
		{
			System.out.println(a+" and "+b+" are Anagram");
		}
		else {
			System.out.println(a+" and "+b+" are Not Anagram");
		}
	}

}
