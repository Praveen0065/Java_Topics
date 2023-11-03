package synchronization7;

/*
 * public class Sychro2 {
 * 
 * }
 */

class Display {
	
	public void wish(String name) {
		
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

class Mythread extends Thread {
	
	Display d;
	String name;
	
	public Mythread(Display d, String name) {
		
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
		
}

class MainSychro2 {
	
	public static void main(String[] args) {
		Display d = new Display();
		Mythread t = new Mythread(d, "Dhoni");
		Mythread t1 = new Mythread(d, "Kohli");
		t.start();
		t1.start();
				
	}
}