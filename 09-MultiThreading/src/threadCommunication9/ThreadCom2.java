package threadCommunication9;

public class ThreadCom2 {
	
}

class MainThreadCom2 {
	
    public static void main(String[] args) throws InterruptedException {
		
		ThreadB b  = new ThreadB();
		b.start();
		
		synchronized (b) {
			
		System.out.println("Main thread trying to calls wait() method");//1
			b.wait();
		System.out.println("Main thread got notification");//4
		System.out.println(b.total);//5
		}
	
		
	}
}

class ThreadB extends Thread {
	
	int total = 0;
	
	public void run() {
		synchronized (this) {
			
		System.out.println("Child thread starts calculation");//2

		for(int i =1;i<=100;i++) {
			total = total+i;
		}
		System.out.println("Child thread giving notification");//3
		this.notify();
		}
		
	}
	
	
}

/*output

Main thread trying to calls wait() method
Child thread starts calculation
Child thread giving notification
Main thread got notification
5050

 */

