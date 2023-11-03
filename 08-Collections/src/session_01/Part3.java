package session_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Part3 {
   

	 public static void main(String[] args) {
		
		   ArrayList al = new ArrayList();
		   al.add(10);
		   al.add(20);
		   al.add(30);
		   al.add(40);
		   
		   
		   System.out.println("=======forLoop approach=========");
		   // forLoop approach -1 
		   
		   for(int i = 0;i<al.size();i++) {
			   System.out.println(al.get(i));
		   }
		   
		   System.out.println("=======forEachLoop approach=========");
		   
		   // forEachLoop approach -2
		   
		   for(Object obj : al) {
			   System.out.println(obj);
		   }
		   
		   System.out.println("========Iterator approach========");
		   
           // Iterator approach -3 // we want travel forward direction then we will choose this.
		   
		   Iterator iterator = al.iterator();
		   while(iterator.hasNext()) {
			   System.out.println(iterator.next());
		   }
		   
		   System.out.println("========ListIterator approach========"); 
		   
		  // ListIterator approach -4   // we want travel forward direction or backward direction then we will choose this.
		   
		   ListIterator listIterator = al.listIterator();
		   while(listIterator.hasNext()) {
			   System.out.println(listIterator.next());
		   }
		   
		   
		   
		   System.out.println("========for each () approach========");
		   
		  // for each() approach -5 // 1.8 version
		   
		   al.forEach(i->{
			   System.out.println(i);
		   });
		 
		 
	 }
}
		 
		 
	/*
	 
	 	1) ArrayList class is not recommended for insertion because it has to perform lot of shiftings
	 	2) ArrayList class is recommended for retrieval operations because it will retrieve based on index directly.
	 	3) internal data structure is growable area
	 	4) duplicates are allowed
	 	5) Homogeneous & Heterogeneous data supported.
	 	 
	 */
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
		 
		 
		 
		 
	
		 
		 
	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

