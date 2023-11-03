package daemonThread11;

public class daemonIntro1 {

}
/*
 1. The thread which is executing at the background is called daemon thread.
 eg: Garbage collector
     Signal dispatcher
     Attach Listener 
 
 The main objective of daemon threads is to provides for non daemon threads(main Thread)
 for example : if main thread run low memory than JVM run garbage collector to destroy useless objects 
  so that number of bytes of free memory will be improved. 
  with this free memory main thread can continue its execution.
 
 2. Usually daemon threads having low priority but based on our requirement daemon thread can run high priority also.
 
 3. It is impossible to change daemon nature on main thread.because it is already started by JVM 
 at the beginning
 
 
*/

class DeamonThread1 extends Thread {
	
}
class MainDeamon1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon()); // false
		
		DeamonThread1 t = new DeamonThread1();
		System.out.println(t.isDaemon()); //false
		
		t.setDaemon(true);
		System.out.println(t.isDaemon()); //true
		
		
	}
}
// The main purpose of daemon thread is provide support for non daemons thread.
// Once last non daemon threads complete All daemons will be completed.