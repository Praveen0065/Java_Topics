package enhancement13;

public class Display4 {
	
	public void wish(String name) {
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
class Mythread4 extends Thread {
	
	Display4 d;
	String name;
	
	public Mythread4(Display4 d, String name) {
		
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}

}
class MainDisplay4 {
	public static void main(String[] args) {
		
		Display4 d1 = new Display4();
		Mythread4 t1 = new Mythread4(d1, "Dhoni");
		Mythread4 t2 = new Mythread4(d1, "Hardik");
		t1.start();
		t2.start();
		
		
	}
}

/* OUTPUT

Good Morning : Good Morning : Hardik
Good Morning : Dhoni
Good Morning : Hardik
Dhoni
Good Morning : Good Morning : Hardik
Good Morning : Dhoni
Good Morning : Hardik
Dhoni
Good Morning : Good Morning : Hardik
Dhoni


 
 

*/
