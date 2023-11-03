package threadFromExecution6;

public class Joins3 extends Thread {
	
	static Thread mt;
	
	public void run() {
		
		try {
			mt.join();
		}
		catch (Exception e) {
			
		}
		for (int i =0;i<10;i++) {
			System.out.println("Child Thread..");
		}
	}

}

class MainJoin3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Joins3.mt = Thread.currentThread();
		
		Joins3 t = new Joins3();
		t.start();
		for (int i =0;i<10;i++) {
			System.out.println("Main Thread..");
			Thread.sleep(2000);
		}
		
		
		
	}
	
}
