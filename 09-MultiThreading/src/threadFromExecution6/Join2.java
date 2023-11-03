package threadFromExecution6;
/*
 *  if a thread wants to wait. until complete some other thread than we should go for join method.
 * 
 *  eg : if a thread t1 wants to wait until completing t2. than t1 as to call t2.join()
 *  
 *       if t1 execute t2.join() than  immediately t1 will be entered into waiting stage until t2 completes.
 *       one t2 complete than t1 can continue its execution.
 * 
 */


public class Join2 extends Thread {
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("Seetha Thread");
			try {
				Thread.sleep(2000);
			}
			catch (Exception e) {
				
			}
		}
		
	}

}
class MainJoin2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Join2 t = new Join2();
		t.start();
		t.join();
		// t.join(10000); //10000 means 10 seconds (it will wait 10 seconds  to join)
		for(int i=0;i<10;i++) {
			System.out.println("Raama Thread");
		}
		
		
	}

}

// Main thread as wait until child thread complete
// Raama Thread as wait until seetha thread complete

//case 1 : waiting of main thread until completing child thread

//--------------------------------------------------------

/*

      public final void join();  throws InterpretedException 
        
      public final void join(long ms); throws IE
      
      public final void join(long ms, int ms);  throws IE
      
      
      note : every join method throws InterpretedException which is checked exception
      Hence compulsory we should handle this exception either by using try catch or by throws keyword
      otherwise we will get compile time error. 
      
      











*/

