package threadClassConstructors4;

public class ThreadConstruc2  extends Thread { 

}

class MainConstruc2 {
	
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		ThreadConstruc2 t = new ThreadConstruc2();
		System.out.println(t.getName());
		
		Thread.currentThread().setName("Pawan Kalyan");
		System.out.println(Thread.currentThread().getName());
		
		
		
	}
	
}
