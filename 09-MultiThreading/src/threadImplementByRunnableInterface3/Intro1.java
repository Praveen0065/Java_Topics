package threadImplementByRunnableInterface3;

public class Intro1 {

}

/*
 
1. Runnable Interface present in java.lang package and it contains only one method Run method()
  example : public void run()
  
*/

class Myrunnable implements Runnable {

	    public void run() {
	
     		 for(int i =0;i<5;i++) {
     			System.out.println("Child Thread..!");
     		}
	
	}
	
}

class MainThreadDemo {
	
	public static void main(String[] args) {
		
		Myrunnable r = new Myrunnable();
		Thread t = new Thread(r);
		t.start();
		 for(int i =0;i<5;i++) {
  			System.out.println("Main Thread..!");
  		}
	
	}
}

/*
explanation
----------- :


		   Myrunnable r = new Myrunnable();
		
			Thread t1 = new Thread();
		
			Thread t2 = new Thread(r);

case 1 : t1.start(); // A new thread will be created called thread class run method which as empty implementation.

case 2 : t1.run(); // No new thread will be created thread class run method will execute just like a normal method call

case 3 : t2. start(); // A new thread will be created Myrunnable run method will be executed.

case 4 : t2.run(); // No new thread will be created calls like a normal method call.

case 5 : r.start(); // error : cannot find a symbol.

case 6 : r.run(); // Myrunnable run method will be executed just like normal method call.
	
*/
//------------------------------------------------------------------------------------------------
/*                                                 |
                                                   |     
                                                   | 
  first approach :                                 |    second approach :
                                                   |  
public class Mythread3 extends Thread {            |        public Myrunnable implements Runnable {
                                                   |     
   run(){                                          |           run(){
   }                                               |      }
                                                   |}
}                                                  |
                                                   |  eg : Myrunnable extends test also
 eg: Always extends Thread class
  not possible to extend other class                                             
                                                   
                                                 
1. Which approach is best to define a Thread ?

Among two ways of defines a thread implements runnable Approach is recommended
1approch always extends thread class, there is no chance of extending any other class Hence we are missing inheritance benefit
2approch we can extend any other class Hence we won't miss ant inheritance benefit

 because of above reason implement a runnable interface is recommended than extending thread class.









*/








