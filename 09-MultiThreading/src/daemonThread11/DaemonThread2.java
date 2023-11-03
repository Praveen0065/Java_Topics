package daemonThread11;

public class DaemonThread2  extends Thread {
	
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("Child Thread..");
			try {
			  Thread.sleep(2000);	
			} catch (Exception e) {
				
			}
		}
	}

}
class MainDaemon2 {
	public static void main(String[] args) throws InterruptedException {
		
		DaemonThread2 t = new DaemonThread2();
		t.setDaemon(true); //line 1
		t.start();
		System.out.println("End of main Thread..");
	}
}
// if we are commenting line 1 both main and child threads are non daemon Hence both threads will be executed
// until completion
