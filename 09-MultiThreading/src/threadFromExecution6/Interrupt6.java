package threadFromExecution6;

public class Interrupt6 extends Thread {
	
	public void run() {
		
		for(int i =0;i<20;i++) {
			System.out.println("I am Lazy thread.. "+ i);
		}
		System.out.println("I am entering into sleeping stage..");
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println("I am interrupted");
		}
	}

}

class MainInterrupt6 {
	public static void main(String[] args) {
		
		Interrupt6 t = new Interrupt6();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread..");
		
		
		
	}
}
/*
 note : when ever we are calling interrupt method if the target thread not in sleeping state or waiting state 
 than there is no impact of interrupt called immediately
 interrupt call will be waited until target thread entered into sleeping or waiting state.
 if the target thread entered into sleeping state than immediately interrupt called will interrupt the target thread
 
 ** comparison table of yield , join and sleep methods **
 
 purpose : -
 1.yield  -- > if the thread wants to pause its execution to give chance to remaining waiting thread of same priority
 2.join -- > if the thread wants to wait until completing some other thread.
 3.sleep -- > if the thread don't want to perform any operation for a particular amount of time.
 
 
 
 
 
 */
