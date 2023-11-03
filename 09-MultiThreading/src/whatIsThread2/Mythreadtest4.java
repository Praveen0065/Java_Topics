package whatIsThread2;

public class Mythreadtest4 extends Thread {  
	
	public void start() {
		
		super.start(); // A new thread will be created 
		System.out.println("Start Method");
	}
	
	public void run() {
		System.out.println("Run method");
	}

}

class Mythreadtest5 {
	
	public static void main(String[] args) {
		
		Mythreadtest4 t = new Mythreadtest4();
		t.start();
		System.out.println("Main Method..");
		
	}
	
}

//------------------------------------------------------------

/*
1. if we over Ride start method than our start method will be executed just like a normal method call.
and new thread won't be created

note : Total output is produced by main thread

2. Not recommended to over ride start method otherwise don't go for multi threading concept.



















*/