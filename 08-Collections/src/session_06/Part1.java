package session_06;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Part1 {
	
	
	
	/*
	 =================================
	 Fail-Fast & Fail-Safe collections
	 =================================
	 Collections are divided into 2 types
	 1) Fail first Collection
	 2) Fail Safe Collection
	 
	 -> Fail Fast collection will throw error immediately when we modify collection object while traversing the collection.
	   Ex : ArrayList, LinkedList, Vector, HashSet, LinkedHashSet etc...
	   
	   Note  : Fail Fast collection will throw Exception when collection data is modified 
	   
	 
	 -> Fail Safe collection will not throw any error even if we modify collection object data (Add/ Remove) while traversing
	   Ex : CopyOnWriteArrayList, ConcurrentHashMap etc..
	 
	 
	 
	 
	 */
	
	//----------------------------------------------------
	  /*  //Fail Fast collection
	    public static void main(String[] args) {
			
	    	ArrayList<Integer>  al = new ArrayList<>();
	    	al.add(100);
	    	al.add(200);
	    	al.add(300);
	    	al.add(400);
	    	
	    	
	    	for(int i : al) {
	    		System.out.println(i);
	    		if(i==100) {
	    			al.add(150);
	    		}
	    	}
	    	   /*
	    	   100
               Exception in thread "main" java.util.ConcurrentModificationException
	           at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	           at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	           at session_06.Part1.main(Part1.java:40)

	    	   */
	    	
	 //----------------------------------------------------
	    	
	      public static void main(String[] args) {
	    	  
	    	// Fail Safe collection 
	    	
	    	CopyOnWriteArrayList<Integer> al1 = new CopyOnWriteArrayList<>();
	    	al1.add(100);
	    	al1.add(200);
	    	al1.add(300);
	    	al1.add(400);
	    	
	    	for(int j : al1) {
	    		System.out.println(j);
	    		if(j==100) {
	    			al1.add(105);
	    		}
	    	}
	    	
	    	System.out.println(al1); // [100, 200, 300, 400, 105]
    	
		}
	
	

}
