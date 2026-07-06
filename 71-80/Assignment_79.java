package assignment_71_to_80;
import java.util.Arrays;			import java.util.Enumeration;			import java.util.Vector;
public class Assignment_79 {
	public static void main(String[] args) {
		System.out.println("WAP to create Vector class which contains names. 1.add elements to it using add() ,addElement() 2.print all elements 3.check size and capacity of vector 4.check elements using contains() 5.Iterate using Enumeration 6.print firstElement and LastElement 7. use set method to replace -->set(3,\"Ram\") 8.Explore removeElement() ,removeElementAt(),insertElementAt() methods as well\n\n");
		Vector <String> v1 = new Vector<String>(Arrays.asList("Rahul", "Narendra","Mamta","Arvind"));
		System.out.println("The initial vector is: \n"+ v1);
		
		//1.add elements in the list using add(),addElement() //2. Printing all the elements:
		v1.add("Vijay");			v1.addElement("MK");
		System.out.println("After adding elements in the Vector: "+v1);
		
		//3.check size & capacity of Vector 
		int size = v1.size();		int cap = v1.capacity();
		System.out.println("The size of vector is: "+ size+" & The capacity of vector is "+ cap);
		
		//4.checking elements using contains():
		boolean b1 = v1.contains("Vijay");		boolean b2 = v1.contains("Ashok");
		System.out.println("Vijay is in vector v1: "+ b1);
		System.out.println("Ashok is in vector v1: "+ b2);
		
		//5.Iterate using Enumeration:
		Enumeration<String> e1 = v1.elements();
		while(e1.hasMoreElements()){System.out.println(e1.nextElement());
		}
		
		//6.Print 1st & Last Element
		System.out.println("1st element is: "+v1.firstElement()+", Last element is: "+v1.lastElement());
		
		//7.replacing an element using set()
		v1.set(2, "Ram");
		System.out.println("After replacing element at index 2 with Ram, The List becomes: "+ v1);
		
		//8.various remove()
		v1.removeElement("MK");			v1.removeElementAt(3);
		v1.insertElementAt("Suvendu", 1);
		System.out.println("Finally the Vector becomes:\n"+v1);
	}

}
