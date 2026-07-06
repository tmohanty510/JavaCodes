package assignment_91_to_100;

public class Assignment_95 {

	public static void main(String[] args) {
		System.out.println("1)Print all numbers which are divisible by 3 between 1 and 100 2)Print even numbers between 1 to 100 3) Print odd numbers between 1 to 100 Print only those 4)numbers which are not divisible by 4 between 1 and 100 without continue keyword\n\n");

		//1.Print all numbers which are divisible by 3 between 1 and 100 
		
		for(int i=1; i<=100; i++)
		{
			if(i%3==0)
			System.out.println(i);
		}
		//2.Print even numbers between 1 to 100
		
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		
		//3.Print odd numbers between 1 to 100 Print only those
		
		for(int i=1; i<=100; i++)
		{
			if(i%2==1)
				System.out.println(i);
		}
		//4.numbers which are not divisible by 4 between 1 and 100 without continue keyword
		
		for(int i=1; i<=100; i++)
		{
			if(i%4!=0)
				System.out.println(i);
		}
		
	}
	

}
