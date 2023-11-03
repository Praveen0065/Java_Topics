package synchronizedBlock8;

/*
1. What is  synchronized block and advantage ?
if very few lines of the code required  synchronization than it is not recommended to declare entire method as  
 synchronized we have enclose those few lines of the code by using  synchronized block.
 
 The main advantage of  synchronized block over  synchronized method is it reduces waiting time of thread and 
 improves performance of the system.
*/
public class SynchroBlock1 {
	
		
		public void wish(String name) {
			
			
				
			
			;;;;;;;;;// 1 lakh lines of code
			//synchronized (this)
			synchronized (SynchroBlock1.class)
			{
			for(int i =0;i<5;i++) {
				System.out.println("Good Morning : ");
				
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					
				}
				
				System.out.println(name);
			}
			}
		  ;;;;;;;;;;// 1 lakh lines of code
			
		}
		
	}
class testMyThread1 extends Thread {
	
	
	SynchroBlock1 d;
	String name;
	
	public testMyThread1(SynchroBlock1 d, String name) {
		
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
		
}

class MainSynchroBlock1 {
	public static void main(String[] args) {
		
		SynchroBlock1 s1 = new SynchroBlock1();
		SynchroBlock1 s2 = new SynchroBlock1();
		testMyThread1 t1 = new testMyThread1(s1, "Dhoni");
		testMyThread1 t2 = new testMyThread1(s2, "Hardik");
		t1.start();
		t2.start();
		
	}
}

// lock concept applicable for object types and class types but not for primitives
// hence we cant primitive type as argument to synchronized block otherwise we will get compile time error
// saying unexpected type found 