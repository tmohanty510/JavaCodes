package assignment_71_to_80;
import java.util.Arrays;
public class Assignment_71 {
	public static void main(String[] args) {
		System.out.println("Q.WAP enter a sentence and print below outputs 1.Split sentence into words 2.count number of words 3.Reverse the words in sentence (Ex: sentence -> I Love Automation Reverse-->Automation Love I 4.count vowels in sentence\n\n");
		String s = "I Love Automation";
		int l = s.length();
		System.out.print("Original Sentence: "+s);
		//1. Splitting the sentence into words.
		String a[] = s.split(" ");
		System.out.println("\n\n1. Splitting the sentence into words: " );
		System.out.println(Arrays.toString(a));
		
		//2. Counting the no. of words
		boolean b= false; int space=0;
		char [] ch = s.toCharArray();
		for(int i=0; i<l;i++)
		{		b = Character.isWhitespace(ch[i]);
		if(b)
			space++;}
		System.out.println("\n\n2. The no. of spaces are: " + space);
		System.out.println("The no. of words present is the given String is: " + ++space);
		
		//3. Reversing the words in the sentence
		String[] s1 = s.split(" ");
		System.out.println("\n\n3. Reversing the words in the sentence: ");
		for(int i=s1.length-1; i>=0;i--)
		{
			System.out.print(s1[i]);
			System.out.print(" ");
		}
		
		
		//4. Counting vowels in the sentence
		int vowel=0;
		for(int i=0;i<l;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'|| ch[i]=='A' || ch[i]=='E' 
		|| ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
				vowel++;}
		System.out.println("\n\n4. The no. of vowels present in the sentence are: "+vowel);
	}

}
