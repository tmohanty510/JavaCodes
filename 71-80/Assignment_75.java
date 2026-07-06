package assignment_71_to_80;
import java.util.ArrayList;

public class Assignment_75 {
	public static void main(String[] args) {
		System.out.println("Write a program to show methods of ArrayList:add(Integer e),add(int Index,Integer element),addAll(collection),contains(Object),containsAll(),remove(int index),remove(Object),removeAll(collection),clear(),isEmpty(),get()\n");
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(12); 	a1.add(22);		a1.add(18);		a1.add(8);
		System.out.println("1. The Initial ArrayList:"+a1);		
		
		a1.add(2, 32); a1.add(3,43);
		System.out.println("\n2. After adding an element to the ArrayList:"+a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(11);		a2.add(9);		a2.add(6);
		
		a2.addAll(a1);
		System.out.println("\n3. addAll() The Second ArrayList:"+a2);
		
		System.out.println("\n4. Using contains():");
		System.out.println(a2.contains(8));
		
		System.out.println("\nU5. sing containsAll():");
		System.out.println(a2.containsAll(a1));
		
		a2.remove(4);
		System.out.println("\n6. Using remove(index):"+a2);
		
		a2.remove(6);
		System.out.println("\n7. Using remove(Object):"+a2);
		
		a2.get(1);
		System.out.println("\n8. Using get():"+a2);
		
		a2.removeAll(a1);
		System.out.println("\n9. Using removeAll(Collection):"+a2);
		
		a2.clear();
		System.out.println("\n10. Using clear():");
		System.out.println(a2);
		
		a2.isEmpty();
		System.out.println("\n11. Using isEmpty():"+a2);
	
	}

}
