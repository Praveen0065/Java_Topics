package enhancement13;

/*
 
 Based on functionality we group threads into a single unit is called as Thread Group.
 that is thread group contains group of thread 
 In addition to thread group contains some thread groups.
 
 The main advantage of maintaining in the form of thread group is we can perform common operation 
 very easily.

*/



public class ThreadGroup1 {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		                  //main Thread         //mainThreadGroup  //system      //system
		                                                           //thread Group
		
		ThreadGroup g1 = new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName()); // main
		
		ThreadGroup g2 = new ThreadGroup(g1,"Second Group");
		System.out.println(g2.getParent().getName()); // First Group
		
  //--------------------------------------------------------------
		//setMaxPriority()
		//getPriority()
		
		ThreadGroup g = new ThreadGroup("tg");
		Thread t1 = new Thread(g,"Thread1");
		Thread t2  = new Thread(g,"Thread2");
		
		g.setMaxPriority(3);
		Thread t3  = new Thread(g,"Thread3");
		
		System.out.println(t1.getPriority()); //5
		System.out.println(t2.getPriority()); //5
		System.out.println(t3.getPriority()); //3
  //---------------------------------------------------------------		
	}

}
/*
 1. Every thread in java belongs to some group.
 2. Main thread belongs to main group.
 3. Every thread group in java is the child group of system group of either directly or indirectly.
   Hence system group act as root for all thread groups in java.
 4. System groups contains several system level threads like finalizer, Reference Handler, Signal Dispatcher, attach listener,
 
 
    Constructor:
    
   1. ThreadGroup g = new ThreadGroup(String gname);   // g means Group
    creates a new thread group with the specified group name
    The parent of this group is the thread group of currently executing thread
    eg: ThreadGroup g = new ThreadGroup("First Group");
    
   2. ThreadGroup g = new ThreadGroup(ThreadGroup pg String Groupname"); // pg means parentGroup
      ThreadGroup g1 = new ThreadGroup(g,"Second Group");
      creates a new thread group with the specified group name
     The parent of this group is the thread group is specified parent group.
 

 */




