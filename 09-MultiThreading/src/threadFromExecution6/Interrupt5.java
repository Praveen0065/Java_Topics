package threadFromExecution6;

//1.How a thread can interrupt another thread ?
//thread class contains one method is there interrupt
//a thread  can interrupt a sleeping thread or waiting thread by using interrupt method of thread class.
//public void interrupt()



public class Interrupt5 extends Thread {
	
	public void run() {
		
		try {
			    for(int i =0;i<5;i++) {
				System.out.println("I am Lazy thread");
			 	Thread.sleep(2000);
			    }
		    }
			catch (Exception e) {
				System.out.println("I got interrupted");
			}
	
	}

}

class MainInterrupt5 {
	
	public static void main(String[] args) {
		
		Interrupt5 t = new Interrupt5();
		t.start();
		t.interrupt(); //line 1
		System.out.println("End of Main Thread");
		
	}
}

// In this case child thread will execute for loop 10 times 
/* we are not commenting line 1 than main thread interrupt child thread in this case output is 
End of Main Thread
I am Lazy thread
I got interrupted




*/