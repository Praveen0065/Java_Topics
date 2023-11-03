package enhancement13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 
  Thread Pools( Executer Frame work )
  
  creating a new thread for every job make a performance and memory problem To overcame this we should go for thread pool
  Thread pool is pool of already created thread ready to to our job 
  Java 1.5 version introduces Thread pool frame work to implement thread pool
  Thread pool frame work also know as Executer frame work.
  
 
 
 */
/*

Note : While designing web servers and application servers we can use thread pool concept.


*/


public class ThreadPools8  {

}

class PrintJob implements Runnable {
      
	String name;
	PrintJob(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name+ "..Job Started by Thread :"+ Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
			
		}
		System.out.println(name+ "..Job Completed by Thread :"+ Thread.currentThread().getName());
	}
	
}
class MainExecuterpool8 {
	public static void main(String[] args) {
		
		PrintJob[] jobs = {
				            new PrintJob("Praveen"),
				            new PrintJob("Dasari"),
				            new PrintJob("Ajay"),
				            new PrintJob("Kiran"),
				            new PrintJob("Madhu")
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(PrintJob job : jobs) {
			service.submit(job);
		}
		service.shutdown();
	}
}

/* OUTPUT

Ajay..Job Started by Thread :pool-1-thread-3
Dasari..Job Started by Thread :pool-1-thread-2
Praveen..Job Started by Thread :pool-1-thread-1
Dasari..Job Completed by Thread :pool-1-thread-2
Kiran..Job Started by Thread :pool-1-thread-2
Ajay..Job Completed by Thread :pool-1-thread-3
Madhu..Job Started by Thread :pool-1-thread-3
Praveen..Job Completed by Thread :pool-1-thread-1
Kiran..Job Completed by Thread :pool-1-thread-2
Madhu..Job Completed by Thread :pool-1-thread-3



 
 

*/

