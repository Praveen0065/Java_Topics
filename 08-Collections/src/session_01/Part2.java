package session_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Part2 {


/*     
 
   ======================
    List Interface
   ======================
          
          -> It is child interface of collection interface
          -> List interface having 4 implementation classes
          -> Allows duplicate objects
          -> It will maintains objects in insertion order 
          -> It is having 4 implementation classes
          
          1) ArrayList
          2) LinkedList
          3) Vector
          4) Stack
          
          List l = new List(); // Invalid Because we can't create object for interface
          ArrayList al = new ArrayList(); // valid
          List l = new ArrayList(); // valid 
          List l = new ListList(); // valid 
          
      ============
      ArrayList
      ============
         -> Implementation class of List interface
         -> Duplicates objects are allowed
         -> Insertion order preserved
         -> null Values are accepted
         -> Internal data structure of ArrayList is growable array
         -> Default capacity 10
         
    
      ======================
      ArrayList Constructors
      ======================
      
      1) ArrayList al = new ArrayList(); //10 default capacity  // when you don't know the size of object we can go through this constructor
      2) ArrayList al = new ArrayList(int capacity); // when we know exactly size of objects
      3) ArrayList al = new ArrayList(Collection c); // if we want to convert one collection into another collection 
      
      
      =======================  
      ArrayList Methods
      ======================   
      
      1) add(Object obj);
      2) addAll(Collection c);
      3) remove(Object obj);
      4) remove(int index);
      5) get(int index);
      6) contains(Object obj)
      7) clear();
      8) isEmpty();
      9) retainAll(Collection c);
      10) indexOf(Object obj);
      11) lastIndexOf(Object obj);
      12) set(int index, Object obj);
      13) iterator() --> forward direction
      14) ListIterator() --> forward back
      
          
    */      
        
        
	           public static void main(String[] args) {
		
        //	--------** ArrayList **----------------------------
		
	        	ArrayList l = new ArrayList(); // Object creation - default capacity 10
	   	
		         l.add("A");
		         l.add(10);
		         l.add("A");
		         l.add(null);
		         System.out.println(l); //[A, 10, A, null]
		
		         l.remove(2);
		         System.out.println(l); //[A, 10, null]
		
		         l.add(2,"M");
		         l.add("N");		
		         System.out.println(l); //[A, 10, M, null, N]
		
          
 

       //-------------------------------------------------------
          
             List l1 = new ArrayList();
             
             l1.add(100);
             l1.add(200);
             l1.add(300);
             l1.add(400);
             l1.add(1000);
             
             System.out.println(l1); // [100,200,300,400,1000]
             
             l1.add(0,500);
             
             System.out.println(l1); // [500, 100, 200, 300, 400, 1000]
             
             System.out.println(l1.contains(700)); //false
             System.out.println(l1.indexOf(100)); // 1
             System.out.println(l1.lastIndexOf(1000)); // 5
             
             List l2 = new ArrayList();
             l2.add(400);
             l2.add(500);
             l2.addAll(l1);
             
             System.out.println(l2); // [400, 500, 500, 100, 200, 300, 400, 1000]
             
             l2.retainAll(l1); // retain is used for common objects  //[400, 500]
             
             System.out.println(l2); 
             
             



	}
}