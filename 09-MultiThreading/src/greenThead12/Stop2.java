package greenThead12;

// we can stop a thread execution by using stop method of thread class

public class Stop2 extends Thread {
	
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println("Child Thread..");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			
			}
		}
	}

}
class MainStop2  {
	public static void main(String[] args) {
		
		Stop2 t = new Stop2();
		t.start();
		System.out.println("Main Thread..");
		t.stop();
		
	}
	
}
