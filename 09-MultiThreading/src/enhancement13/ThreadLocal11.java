package enhancement13;

public class ThreadLocal11 extends Thread {

	public static ThreadLocal t1 = new ThreadLocal();
	
	public void run() {
		t1.set("pp");
		System.out.println("Parent Thread value--" +t1.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
			
	
}
class ChildThread extends Thread {
	public void run() {
		System.out.println("Child Thread value--"+ ThreadLocal11.t1.get());
	}
}
class MainThreadlocal11 {
	public static void main(String[] args) {
		ThreadLocal11 pt = new ThreadLocal11();
		pt.start();
	}
}