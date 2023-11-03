package threadPriorities5;

public class ThreadPri1 extends Thread {

}
class mainThreadPri1{
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		
		ThreadPri1 t = new ThreadPri1();
		System.out.println(t.getPriority());
		
	}
}
/*

Every thread in java have some Priorities

Thread. Min Priority 1
Thread. Norm Priority 5
Thread. Max Priority 10

Thread class defines the following constancy to represent some standard Priorities

note The thread which as high Priority give a chance




*/