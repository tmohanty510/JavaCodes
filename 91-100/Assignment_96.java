package assignment_91_to_100;
public class Assignment_96 {
public static void main(String[] args) {
				//1.Print all numbers which are divisible by 3 between 1 and 100 
				System.out.println("1.Print all numbers which are divisible by 3 between 1 and 100\n");
				for(int i=1; i<=100; i++)
				{
					if(i%3!=0)
						continue;
					System.out.println(i);
				}
				//2.Print even numbers between 1 to 100
				System.out.println("\n2.Print even numbers between 1 to 100");
				for(int i=1; i<=100; i++)
				{
					if(i%2!=0)
						continue;
					System.out.println(i);
				}
				//3.Print odd numbers between 1 to 100 Print only those
				System.out.println("\n3.Print odd numbers between 1 to 100 Print only those");
				for(int i=1; i<=100; i++)
				{
					if(i%2==0)
						continue;
					System.out.println(i);
				}
				//4.numbers which are not divisible by 4 between 1 and 100
				System.out.println("\n4.Numbers which are not divisible by 4 between 1 and 100 by using continue keyword");
				for(int i=1; i<=100; i++)
				{
					if(i%4==0)
						continue;
					System.out.println(i);
				}
			}
		}


