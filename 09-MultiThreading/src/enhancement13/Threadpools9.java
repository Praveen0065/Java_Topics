package enhancement13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Threadpools9 {

}


class Mycallable implements Callable {
	int num;
	 Mycallable(int num) {
		this.num = num;
	}
	 public Object call() throws Exception {
		 System.out.println(Thread.currentThread().getName()+ "is..Responsible to find sum of first "+ num + "numbers");
		 int sum =0;
		 for(int i=1;i<=num;i++) {
			 sum = sum+i;
		 }
		 return sum;
	 }
}
class MainCallable9 {
	public static void main(String[] args) throws Exception {
		
		Mycallable[] jobs = {
	            new Mycallable(10),
	            new Mycallable(20),
	            new Mycallable(30),
	            new Mycallable(40),
	            new Mycallable(50) };
		
	
	
	ExecutorService service = Executors.newFixedThreadPool(3);
	for(Mycallable job : jobs) {
		Future f = service.submit(job);
		System.out.println(f.get());
		
	}
	service.shutdown();
}
}

/* OUTPUT

pool-1-thread-1is..Responsible to find sum of first 10numbers
55
pool-1-thread-2is..Responsible to find sum of first 20numbers
210
pool-1-thread-3is..Responsible to find sum of first 30numbers
465
pool-1-thread-1is..Responsible to find sum of first 40numbers
820
pool-1-thread-2is..Responsible to find sum of first 50numbers
1275


 
 

*/


