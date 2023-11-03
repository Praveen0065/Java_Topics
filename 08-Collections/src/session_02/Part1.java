package session_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Part1 {

/*
      ============
      Set
      ============
      -> Set is a interface available in java.util package.
      -> Set interface extending from collection interface.
      -> Set is used to store group of objects.
      -> Duplicates objects are not allowed.
      -> Supports Homogeneous & Heterogeneous
      =============================
      Set interface Implementation classes
      ==============================
      1) HashSet
      2) LinkedHashSet
      3) TreeSet
      
      
         ==========
         HashSet
         ==========
         1) Implementation class of Set interface
         2) Null is allowed
         3) Insertion order will not be maintained
         4) Duplicates are not allowed
         5) Initial capacity is 16
         6) Load factor 0.75
         7) Internal DataStructure is HashTable
         
         ============
         Constructors
         ============
         
         HashSet hs = new HashSet();
         HashSet hs = new HashSet(int capacity);
         HashSet hs = new HashSet(int capacity, float loadFactor);
         
 
 
 */
	
	     public static void main(String[] args) {
			
	    	HashSet<String> hs = new HashSet<>();
	    	hs.add("one");
	    	hs.add("two");
	    	hs.add("three");
	    	hs.add("four");
	    	hs.add("one");
	    	hs.add(null);
	    	
	    	System.out.println(hs);
	    	hs.remove("three");
	    	System.out.println(hs);
	    	
	    	Iterator<String> iterator = hs.iterator();
	    	while(iterator.hasNext()) {
	    		System.out.println(iterator.next());
	    	}
	    	System.out.println("=====");
	    	
	    	//--------------------------------
		
	    	 
		
	     
	     /*
	      
	      ===================
	      LinkedHashSet
	      ==================
	      
	      -> Implementation class for Set interface
	      -> Duplicates are not allowed
	      -> insertion order will be preserved
	      -> Internal data structure is Hash table + Double Linked list
	      
	      
	      
	      */
	    	
	    	
	    	LinkedHashSet<Integer> hs1 = new LinkedHashSet<>();
	    	hs1.add(10);
	    	hs1.add(20);
	    	hs1.add(30);
	    	hs1.add(null);
	    	hs1.add(40);
	    	hs1.add(20);
	    	
	    	System.out.println(hs1); // [10, 20, 30, null, 40]
	    	System.out.println("=======");
	    	
	   //Note : HashSet will not maintain insertion order where as LinkedHashSet will maintain insertion order.
	   //       HashSet will follow  HashTable data Structure where as LinkedHashSet will follow HashTable + Double Linked List data Structure.
	    
	    	
	    /*
	     
	     ============
	     TreeSet
	     ===========
	     -> Implementation class for Set interface
	     -> It will maintain Natural sorting order
	     -> Duplicates are not allowed 
	     -> null values not allowed
	     -> Homogeneous Values only
	     note: TreeSet Should perform sorting so always it will compare new added object with old object.
	           In order to compare Objects should be of same type.
    
	     */
	    	
	    	TreeSet ts = new TreeSet<>();
	    	
	    	ts.add(13);
	    	ts.add(7);
	    	ts.add(9);
	    	ts.add(1);
	    	ts.add(3);
	    	
	    	System.out.println(ts);
	    	
	    
		
	     }
	     
	 /*
	      
	  = List Interface & Implementation classes 
	     
	        - Duplicates Allowed
	        - Insertion order maintained
	        - Homogeneous & Heterogeneous data Allowed
	       
	      Example  : ArrayList , LinkedList, Vector, Stack 
	      
	  = Set Interface & Implementation classes  
	         
	        - Duplicates not allowed
	        - only LHS will maintain insertion order
	        - TreeSet Supports only homogeneous data ( For Sorting )
	        
	      Example : HashSet , LinkedHashSet, TreeSet
	      
	  
	      
	  = Cursors : To Traverse collection objects
	       1) Iterator
	       2) ListIterator
	       3) Enumeration    
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	    
	 */
	     
}
