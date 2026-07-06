package assignment_91_to_100;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Assignment_93 {
	public static void main(String[] args) {
		System.out.println("Write a Java program to create 1)synchronized List using Collections.synchronizedList() and iterate the elements using synchronized block. 2)synchronized Set using Collections.synchronizedSet() and iterate the elements using synchronized block. 3)synchronized Map using Collections.synchronizedMap() and iterate the elements using synchronized block.\n");
		List<Integer> l1 = new ArrayList<> (Arrays.asList(12,13,14,15,16));
		List<Integer> syncl1 = Collections.synchronizedList(l1);
		syncl1.add(17); syncl1.add(18); syncl1.add(19);
		System.out.println("Traversing through the synchronized List");
		synchronized(syncl1) {
			for(int i : syncl1) 
			{		System.out.println(i);
			}
		}
		Set<Integer> s1 = new HashSet<> (Arrays.asList(21,22, 23, 24, 25, 26));
		Set<Integer> syncs1 = Collections.synchronizedSet(s1);
		syncs1.add(18); syncs1.add(19); syncs1.add(20);
		System.out.println("Traversing through Synchronized Set");
		synchronized (syncs1){
			for(int i : syncs1) {
				System.out.println(i);
			}
		}
		System.out.println("Traversing through Map-\n");
		Map<Integer, String> m1 = new HashMap<> ();
		m1.put(1, "Abhi");		m1.put(2, "Bijay");		m1.put(3, "Chiru");		m1.put(4, "Deepak");		m1.put(5, "Ekta");
		Map<Integer, String> syncm1 = Collections.synchronizedMap(m1);
		syncm1.put(6, "Firoz"); syncm1.put(7, "Gautam"); syncm1.put(8, "Hemanth");
		synchronized (syncm1)
		{
			for(Entry<Integer, String> entry : syncm1.entrySet()) 
			{
				System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			}
		}
	}
}

