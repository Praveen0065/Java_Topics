package whatIsThread2;

public class Mythread3 extends Thread {
	
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("Child thread..");
		}
	}

}

class Mythread4 {
	
	public static void main(String[] args) {
		 
		Mythread3 t = new Mythread3();
		t.start();
		
		for(int i = 0;i<5;i++) {
			System.out.println("Main thread..");
		}
		
	}
	
	
}

