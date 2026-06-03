package assignment_1_to_20;
public class Assignment_17 {
	public static void main(String[] args) {
		System.out.println("Write a program to categorize a person based on age: If age ≥ 18 If age ≥ 60 → “Senior Citizen” Else if age ≥ 40 → “Middle-aged Adult” Else → “Adult” Else If age ≥ 13 → “Teenager” Else → “Child” \n"
				+ "");
		int age= 26;
		if(age>=18){
			if(age>=60)
			{
				System.out.println("Senior Citizen");
			}
			if(age>=40)
			{
				System.out.println("Middle Aged");
			}
			else
			{
				System.out.println("Adult");
			}
		   }
		else if(age>=13){
			System.out.println("Teenager");
		}
		else {
			System.out.println("Child");
		}
	}
}
