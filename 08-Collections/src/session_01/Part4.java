package session_01;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Part4 {

/*
    
    ===================
    LinkedList
    ===================
    
   -> LinkedList is one of the implementation classes of Collection interface
   -> Internal data structure is double linked list
   -> Insertion order preserved 
   -> Duplicates objects are allowed
   -> null objects also allow
   -> Homogeneous & Heterogeneous data supported.

 
 */
	
	   public static void main(String[] args) {
		
		   
		   LinkedList<Integer> l1 = new LinkedList();
		   l1.add(10); // 1 node
		   l1.add(20); // 1 node
		   l1.add(30); // 1 node
		   l1.add(40); // 1 node
		   
		   System.out.println(l1); // [10, 20, 30, 40]
		   
		   l1.add(1,15);
		   System.out.println(l1); // [10, 15, 20, 30, 40]
		   System.out.println(l1.getLast());
		   
		   
		   
/*
      ====================
      Vector
      ===================
 	
 	  -> Vector is the implementation class of List interface
 	  -> Internal data structure is growable array
 	  -> Duplicates are allowed
 	  -> Insertion order preserved
 	  -> This is synchronized (One thread can access at a time)
 	  -> Vector is legacy class (jdk v 1.0)
 	  
 	  -> To traverse Vector we can use Enumeration as a cursor
 	  -> Enumeration is called as Legacy Cursor(jdk 1.0)
 	  
		      
 		      
 */
		   
		   
		   Vector<Integer> v = new Vector();
		   v.add(100);
		   v.add(200);
		   v.add(300);
		   
		   System.out.println(v);
		   
		   Enumeration<Integer> elements = v.elements();  // Enumeration for only vector and stack
		   while(elements.hasMoreElements()) {
			   System.out.println(elements.nextElement());
		   }
		   
		
		   
 /*
  
     ===================	 
     	Stack
     ===================
     -> Implementation class of list interface.
     -> Extending from Vector class
     -> Data Structure of stack is LIFO(last in first out)
     
     push() --> to insert object
     peek() --> to get last element
     pop() -->  remove top element and return that
	   
  		   
  		   
  */
		   
		   Stack s = new Stack();
		   s.push(10);
		   s.push(20);
		   s.push(30);
		   
		   System.out.println(s); //[10, 20, 30]
		   System.out.println(s.peek()); // 30 // Top element
		   System.out.println(s.pop()); // remove top element and return that
		   System.out.println(s); // 30
		   
		   
		   
	   
		   
		   
		   
	}
	   
	   /*
	         1) ArrayList --> Growable Array
	         2) LinkedList --> Double Linked list
	         3) Vector --> Growable Array & Thread Safe
	         4) Stack --> L I F O ( last in first out )
	         
	         --------------
	         1) Iterator --> forward direction
	         2) ListIterator --> forward & backward Direction
	         3) Enumeration --> forward direction & supports for legacy collection classes.
	   
	    */
	
	
}
