package threadFromExecution6;

/*
we can prevent a thread execution by using this methods 

1.Yield();
2.join();
3.sleep();

*/

//(imp) yield method causes to pause current executing thread to give the chance for waiting threads of same priority
// if there is no waiting thread are all waiting threads have low priority. than same thread can continue its execution.


public class Yield1 extends Thread {
	
	public void run() {
		 for(int i =0;i<5;i++) {
			 
			System.out.println("Child Thread");
			Thread.yield(); // line 1
		}
	}

}
class MainYield1 {
	
	public static void main(String[] args) {
		
		Yield1 t = new Yield1();
		t.start();
		
		 for(int i =0;i<5;i++) {
			 
				System.out.println("Main Thread");
			}
		
	}
}


//  In the above program we are commenting line 1 than both threads will be executed simultaneously -
// - and we can't expect with thread will complete first.
// if we are not commenting line 1 than child thread always calls yield method because -
// - of that main thread will get chance more number of times and the chance of completing main thread high.
