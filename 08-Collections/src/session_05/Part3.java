package session_05;

public class Part3 {
	
	/*
	    
	    ===============================
	     1) Collections Sorting (Comparator)
	    ===============================
	     
	 ==> If we want apply sorting on user-defined objects like Student,Employee,Product,Customer etc..
	     Then we have 2 approaches
	     1) Comparable (java.lang)
	     2) Comparator (java.util)
	      
	      
	     ============
	     Comparable
	     ============ 
	     -> Comparable is a predefined interface available in java.lang.package
	     -> Comparable interface having compareTo( Object obj ) method
	     -> compareTo() Method used to compare an object with itself and returns int value
	     
	        if(obj1> obj2)--return +ve no
	        if(obj1< obj2)--return -ve no
	        if(obj1==obj2)--return +zero (0)
	 
	 Note : Comparable interface will allow us to sort the data based on only one value.
	        if we want to change our sorting technique then we need to modify the class which is implementing Comparable interface.
	        
	        => To overcome these problem we will go for Comparator interface.
	      
	      =============
	      Comparator
	      ============  
	     -> Comparator is a predefined interface available in java.util.package
	     -> Comparator interface having compare(Object obj1, Object obj2)
	     
	     
	     Q) Difference between Comparable & Comparator ?
	        
	        Comparable is used to sort the data by using one property.
	        Comparator is used to sort the data based on multiple properties flexibility is more when we go for Comparator.
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */

}
