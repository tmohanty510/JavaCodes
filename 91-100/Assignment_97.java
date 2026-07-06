package assignment_91_to_100;
import java.util.Arrays;
import java.util.LinkedList;
public class Assignment_97 {
	public static void main(String[] args) {System.out.println("\"Write a Java program that demonstrates  LinkedList–specific methods clearly: add() get() addFirst() addLast() removeFirst() removeLast() getFirst() getLast() offer() poll() peek()\"");
		LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(14,15,16,17,18,19,20));
		System.out.println("\n\nInitial LinkedList: " + l1);
		
		//1.add()
		l1.add(21); 			System.out.println("\nAfter adding 21 in the LinkedList: "+l1);
		
		//2.get()
		System.out.println("\nFetching the value at index '3': " + l1.get(3));
		
		//3.addFirst()
		l1.addFirst(13);		System.out.println("\nAdding '13' at the beginning of LinkedList: " + l1);

		//4.addLast()
		l1.addLast(22); 		System.out.println("\nAdding '22' at the end of LinkedList: "+l1);
		
		//5.removeFirst()
		l1.removeFirst();		System.out.println("\nAfter removing the 1st element ,the LinkedList becomes: "+l1);
		
		//6.removeLast()
		l1.removeLast();		System.out.println("\nAfter removing the Last element, the LinkedList becomes: "+l1);
		
		//7.getFirst()
		System.out.println("\nFetching the first element: " +l1.getFirst());
		
		//8.getLast()
		System.out.println("\nFetching the last element of the LinkedList: " +l1.getLast());
		
		//9.offer()
		l1.offer(23);	  	    System.out.println("\nOffering/adding '23' in the LinkedList i.e. adding at the tail/end: "+l1);
		
		//10.poll()
		System.out.print("\nAfter poll()[Fetches and also Removes the 1st element of the LinkedList]: " + l1.poll());		System.out.println("\t" +l1);
		
		//11.peek()
		System.out.println("\npeek()[fetches the 1st element of the LinkedList]: " + l1.peek());
		
	}

}
