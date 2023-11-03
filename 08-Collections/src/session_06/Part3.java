package session_06;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class Part3 {
    
	/* 1Q) Difference between HashMap & IdentityHashMap
	   
	   => HashMap will use equals() method to compare content of keys to find duplicates 
	   => identityHashMap will use == operator to compare address of keys to find duplicate keys
	  
	  2Q) Difference between HashMap & WeakHashMap
	  
	  => HashMap keys will have strong reference that means they will maintain a reference hence they are not eligible for
	     Garbage Collector
	  => WeakHashMap keys will have weak reference that means they are eligible for Garbage collection
	  => GC will dominate WeakHashMap 
	
	*/
	
	 
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		// HashMap will compare content of the keys to find duplicate keys (equals()) method
		
		hm.put("praveen", 101); // 1 entry added
		hm.put("raja", 102); // 1 entry added
		hm.put("rani", 103); // 1 entry added
		hm.put(new String("praveen"), 104); // it will replace first entry value because key is duplicate.
				
		System.out.println("HM - Size :: "+ hm.size());
		System.out.println(hm);
		
		System.out.println("===============");
		
		IdentityHashMap<String, Integer> ihm = new IdentityHashMap<>();
		
		// IdentityHashMap compare address of keys to find duplicate keys (==)
		
		ihm.put("praveen", 101); // 1 entry added (scp)
		ihm.put("raja", 102); // 1 entry added
		ihm.put("rani", 103); // 1 entry added
		ihm.put(new String("praveen"), 104); // 1 entry added
		ihm.put("praveen", 105); // it will replace firstEntry value
		
		System.out.println("IHM - Size :: "+ ihm.size());
		System.out.println(ihm);
		System.out.println("===============");
		//---------------------------------------------------------
		
		
		WeakHashMap<Integer, String> whm = new WeakHashMap<>();
		whm.put(1, "hi");
		whm.put(2, "hello");
		whm.put(4, "java");
		whm.put(3, "bye");
		
		System.out.println(whm);
		
		
		
		
	}
	
}
