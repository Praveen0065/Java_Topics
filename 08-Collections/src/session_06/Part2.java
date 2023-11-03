package session_06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Part2 {
      
	public static void main(String[] args) {
		
	/*	
		//Fail Fast collection
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "one");
		map.put(102, "two");
		map.put(103, "three");
		
		Set<Integer> key = map.keySet();
		Iterator<Integer> iterator = key.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			map.put(104, "four"); //Exception in thread "main" java.util.ConcurrentModificationException
		}  */
		//---------------------------------------
		
		//Fail Safe collection
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		
		map.put(101, "one");
		map.put(102, "two");
		map.put(103, "three");
		
		Set<Integer> key =  map.keySet();
		Iterator<Integer> iterator = key.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			map.put(104, "four");
		}
		/* output
		 101
         102
         103
         104
		 */
	}
}
