package assignment_81_to_90;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Assignment_90 {
	public static void main(String[] args) {
		System.out.println("Write a java program on Collections methods 1) sort() 2) reverse() 3) shuffle() 4) max() 5) min() 6) swap() 7) binarySearch() 8)frequency()\n\n");
		List<Integer> l1 = new ArrayList<>(Arrays.asList(92,33,44,55));
		System.out.println("The list Initially is: "+l1);
		//1. using sort() to sort the list in ascending order
		Collections.sort(l1);
		System.out.println("\n\n\n1.After sort() the list becomes: "+l1);
		
		//2. using reverse() to reverse the elements of the list/ also sort them in descending order
		Collections.reverse(l1);
		System.out.println("\n2.After reverse() the list becomes: "+l1);
		
		//3, using shuffle() to shuffle/change the elements randomly
		Collections.shuffle(l1);
		System.out.println("\n3.After shuffle() the list becomes: "+l1);
		
		//4. using max() and min() to find smallest & largest element in the list respectively.
		int small = Collections.min(l1);
		int large = Collections.max(l1);
		System.out.println("\n4.The smallest element in the list is: "+small+" & The largest element is: "+large);
		Collections.sort(l1);
		
		//5. using swap() to swap index positions of two elements within the list
		Collections.swap(l1, 0, 2);
		System.out.println("\n5.After swapping the element at index 0 with 2, The list becomes: "+l1);
		Collections.sort(l1);
		
		//6. using binarySearch() to find the index position of an element in a list
		int ind = Collections.binarySearch(l1, 55);
		System.out.println("\n6.The index position of 55 is: "+ind);
		
		//7. using frequency() to find the no. of occurrences of an element in the list
		int oc = Collections.frequency(l1, 44);
		System.out.println("\n7.44 is present "+ oc+" times in the list.");

	}

}
