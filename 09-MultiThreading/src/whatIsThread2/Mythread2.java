package whatIsThread2;

public class Mythread2 extends Thread {
	
	     public void run() {
//		
//		|-------------------------------------------|
// 	 	|   for(int i = 0;i<10;i++) {               |
//		|	                                        |
//		|	System.out.println("Child Thread..");   |-----------Job of Thread
//		|   }                                       |
//		|                                           |
//		|-------------------------------------------|
//		     Executed by child class
	}

}



//-----------------------------------------------------------------------------

class myThreadtest {
	
	public static void main(String[] args) {
		
		Mythread2 t = new Mythread2();
		t.start(); // starting of thread
		
		
//		
//		|-------------------------------------------|
// 	 	|   for(int i = 0;i<10;i++) {               |
//		|	                                        |
//		|	System.out.println("Main Thread..");    |
//		|   }                                       |
//		|                                           |
//		|-------------------------------------------|
//		     Executed by main Thread
	}

	
	
}

//-----------------------------------------------------------------
/*
1. Difference between t.start and t.run ?
if we call t.start a new thread will be created that thread is responsible to execute our job.
if we take t.run our run method will be executed just like a normal method call by the main thread only.

2. What is important of thread class start method ?
  
  Start(){
   
   1. Start register with thread scheduler 
   2. perform all other mandatory activities.
   3. Invoke run()
   
   }

3.Thread Start method is possible for overload ?
 > Yes possible 
 But Thread class start method always calls (no argument) Method
 eg: public void run(){
 }
 








*/