package enhancement13;

// Demo Program for lock method

import java.util.concurrent.locks.ReentrantLock;

public class Display6 {
	
	ReentrantLock l = new ReentrantLock();
	
	public void wish(String name) {
		
		l.lock(); // Line 1
		
		for(int i=0;i<5;i++) {
			System.out.print("Good Morning : " );
			try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				
			}
			System.out.println(name);
		}
		
		l.unlock(); // Line 2
	}

}
class Mythread6 extends Thread {
	
	Display6 d;
	String name;
	
	public Mythread6(Display6 d, String name) {
		
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}

}
class MainDisplay6 {
	public static void main(String[] args) {
		
		Display6 d1 = new Display6();
		Mythread6 t1 = new Mythread6(d1, "Dhoni");
		Mythread6 t2 = new Mythread6(d1, "Hardik");
		Mythread6 t3 = new Mythread6(d1,"Kohli");
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
/*
 If we comment Line 1 and 2 Than the thread will be executed simultaneously and we will get Irregular output.
 If we are not comment Line 1 and 2 Than the thread will be executed  one by one and we will get regular output.
 
 
 */

/* OUTPUT
  
Good Morning : Dhoni
Good Morning : Dhoni
Good Morning : Dhoni
Good Morning : Dhoni
Good Morning : Dhoni
Good Morning : Hardik
Good Morning : Hardik
Good Morning : Hardik
Good Morning : Hardik
Good Morning : Hardik
Good Morning : Kohli
Good Morning : Kohli
Good Morning : Kohli
Good Morning : Kohli
Good Morning : Kohli

 
 

*/
