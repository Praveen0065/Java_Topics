package enhancement13;

// Demo program for trylock method


import java.util.concurrent.locks.ReentrantLock;

public class Display7  extends Thread {
	
	static ReentrantLock l = new ReentrantLock();
	
	Display7(String name){
		super(name);
	}
	
	public void run() {
		
		if(l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " ..Got lock and performing safe operation");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
			l.unlock();
		}
		else {
			System.out.println(Thread.currentThread().getName( )+ " ..unable to get lock and hence performing alternative operations");
		}

	}
	
}
class MainDisplay7 {
	public static void main(String[] args) {

		Display7 t1 = new Display7("First Thread");
		Display7 t2 = new Display7("Second Thread");
		t1.start();
		t2.start();
		
	}
}


/* OUTPUT
  
First Thread ..Got lock and performing safe operation
Second Thread ..unable to get lock and hence performing alternative operations

 

*/