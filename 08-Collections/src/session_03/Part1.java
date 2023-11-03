package session_03;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Part1 {
	/*
	 
	 =============
	 Queue
	 ==========
	 -> It is Extending properties from collection interface
	 -> It is used to store group of objects
	 -> Internal data Structure is FIFO (First in First out)
	 -> It is ordered list of objects
	 -> Insertion will happen at end of the collection
	 -> Removal will happen at beginning of the collection
	 
	 
	 */
	
     public static void main(String[] args) {
	
    	 PriorityQueue<String> queue = new PriorityQueue<>();
    	 queue.add("John");
    	 queue.add("Smith");
    	 queue.add("Orlen");
    	 queue.add("Charles");
    	 
    	 System.out.println(queue);
    	 
    	 System.out.println(queue.element());
    	 System.out.println(queue.peek());
    	 
    	 Iterator<String> iterator = queue.iterator();
    	 while(iterator.hasNext()) {
    		 System.out.println(iterator.next());
    	 }
    	 
    	 queue.remove();
    	 queue.poll();
    	 
    }

}
