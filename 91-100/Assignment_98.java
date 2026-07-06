package assignment_91_to_100;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
public class Assignment_98 {
	public static void main(String[] args) {
		System.out.println("Write a Java program that demonstrates  Priority Queue methods clearly: add() offer() peek() element() iterator() contains() size() poll() remove() clear() isEmpty() ");
		PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(1,2,3,4,5));
		System.out.println("\n\nThe PriorityQueue initially looks like: "+pq);
		//1.add()
		pq.add(6);			System.out.println("\nAfter adding '6' in the Queue: "+ pq);
		//2.offer()
		pq.offer(7); 		System.out.println("\nAfter offering/adding '7' in the Queue: "+ pq);	
		//3.peek()
		System.out.println("\npeek() Fetches the first element of the PriorityQueue: "+pq.peek());
		//4.element()
		System.out.println("\nelement() fetches the first element of the PriorityQueue: "+pq.element());
		
		//5.iterator()
		Iterator<Integer> itr = pq.iterator();
		System.out.println("Iterating through the PriorityQueue using iterator():");
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
		//6.contains()
		boolean b = pq.contains(7); System.out.println("\nIs '7' present: "+ b);	
		
		//7.size()
		System.out.println("\nSize of the PriorityQueue: "+pq.size());
		//8.poll()
		System.out.print("\npoll(): "+pq.poll()); System.out.println(" \t"+pq);
		//9.remove()
		pq.remove((5)); System.out.println("\nAfter removing index 5 element: "+pq);
		//10.clear()
		pq.clear();		System.out.println("\nAfter clear(): "+pq);
		//11.isEmpty()
		System.out.println("\nThe PriorityQueue is empty: "+pq.isEmpty());
	
		}
	

}
