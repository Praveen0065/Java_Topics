package synchronization7;

public class Synchro1 {

}

/*

1. synchronizer is the modifier applicable for only methods and blocks and not for class and variables.
2. if multiple threads are trying to operate simultaneously on the same java object than there will a chance of data inconsistency problem
   to overcame this problem we should go for synchronized keyword
3. if a method are block declared synchronized than at a time only one thread will be execute that method or lock on the given object 
   so that data inconsistency problem resolved.
   
     ==The main advantage of synchronized keyword is we can resolve data inconsistency problem but 
     ==main disadvantage is synchronized keyword is it increases waiting time of threads and creates performance problem hence there is no specific requirement don't use 

*/

/*
 There are two areas in the object synchronized area & non synchronized area.
 
synchronized {

 where ever we are performing update operations (add/replace/delete/remove)
 ie where state of object is changing.

}
 
  non synchronized {
   
   where ever object won't be changed like read operation.
  
  }

*/

class TicketBooking {
	   

	  //non synchronized
	  public void CheckAvailablity() {
		  System.out.println("Searching for availability.."); // like read
	  }
	  
	  //synchronized
	  public void BookTicket() {
		  System.out.println("Booking a ticket.."); // like update
	  }
	
	
}