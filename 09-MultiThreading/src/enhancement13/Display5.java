package enhancement13;

public class Display5 {
	
	public synchronized void wish(String name) {
		for(int i=0;i<5;i++) {
			System.out.print("Good Morning : " );
			try {
			Thread.sleep(2000);	
			} catch (Exception e) {
				
			}
			System.out.println(name);
		}
	}

}
class Mythread5 extends Thread {
	
	Display5 d;
	String name;
	
	public Mythread5(Display5 d, String name) {
		
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}

}
class MainDisplay5 {
	public static void main(String[] args) {
		
		Display5 d1 = new Display5();
		Mythread5 t1 = new Mythread5(d1, "Dhoni");
		Mythread5 t2 = new Mythread5(d1, "Hardik");
		t1.start();
		t2.start();
		
		
	}
}

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


 
 

*/
