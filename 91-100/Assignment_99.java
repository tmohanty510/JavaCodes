package assignment_91_to_100;

class Student{
	private String name = "Bijay";
	private int age = 26;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Assignment_99 {
	public static void main(String[] args) {
		System.out.println("Create a Student class with private variables name and age. Use getter and setter methods to access and modify the data. Display the student details in the main method.\n\n");
		Student s1 = new Student();
		s1.setName("Binay");
		System.out.println("\nStudent's name: "+ s1.getName());
		s1.setAge(21);
		System.out.println("\nStudent's age: "+ s1.getAge());
	}

}
