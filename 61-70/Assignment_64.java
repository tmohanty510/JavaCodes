package assignment_61_to_70;

public class Assignment_64 {

	public static void main(String[] args) {
		System.out.println("WAP to check whether given number is present in an array or not\n\n");
		
		int a[] = {12, 19, 20, 71, 90};
		int num1 = 72;
		int num2 = 19;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==num1)
			{
				System.out.println("Yes, "+num1+" is present at the index position: "+i);
			}
			else if(a[i]==num2)
			{
				System.out.println("Yes, "+num2+" is present at the index position: "+i);
			}
		}

	}

}
