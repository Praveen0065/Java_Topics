package synchronization7;
/*
 
 While a thread executing static synchronized method the remaining thread are not allowed any static synchronized.
 of that class simultaneously but remaining threads are allowed to execute the following methods simultaneously
 
 1. Normal static methods
 2. synchronized instance methods
 3. Normal instance methods
 
 
*/

public class Synchro4 {
	
	 static synchronized void m1() {}
	
	 static synchronized void m2() {}
	
	 static void m3() {}
	
	 synchronized void m4() {}
	 
	  void m5() {}
}

//----------------------------------------------------

class Displays {
	
	public void displayn() {
		
		  for(int i =0;i<10;i++) {
			
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
		}
	}
	

	public void displayc() {
		
		  for(int i =65;i<=75;i++) {
			
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
		}
	}

}
class Mythread1 extends Thread {
	
	 Displays d;

	public Mythread1(Displays d) {		
		this.d = d;
	}
	
	public void run() {
		d.displayn();
	}
}
class Mythread2 extends Thread {
	
	 Displays d;

	public Mythread2(Displays d) {		
		this.d = d;
	}
	
	public void run() {
		d.displayc();
	}
}
class MainSychro4 {
	
	public static void main(String[] args) {
		
		Displays d = new Displays();
		Mythread1 t1 = new Mythread1(d);
		Mythread2 t2 = new Mythread2(d);
		t1.start();
		t2.start();
		
	}
}

// t1 thread calls displayn method
// t2 thread calls displayc method


//------------------------------------------------------------