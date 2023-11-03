package synchronization7;

public class Synchro3 {

}


//if multiple threads operating simultaneously on the same java object synchronization required.
//if multiple threads operating multiple objects synchronization not required.


class Displaytest {
	
	public synchronized void wish(String name) {
		
		for(int i =0;i<10;i++) {
			System.out.println("Good Morning : ");
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
			
			System.out.println(name);
			
		}
	}
	
}

class testMyThread extends Thread {
	
	
	Displaytest d;
	String name;
	
	public testMyThread(Displaytest d, String name) {
		
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
		
}

class MainSychro3 {
	
	public static void main(String[] args) {
		Displaytest d1 = new Displaytest();
		Displaytest d2 = new Displaytest();
		testMyThread t = new testMyThread(d1, "Dhoni");
		testMyThread t1 = new testMyThread(d2, "Kohli");
		t.start();
		t1.start();
				
	}
}