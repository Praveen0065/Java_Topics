package enhancement13;

/*
  Thread local class provides Thread local variable 
  Thread local class maintains values for thread basics
  Each thread local object maintains a separate values like user id, transaction id etc for each thread that access to that object.
  Thread can access its local value we can manipulate this value and even can removes its values
  In every part of the code executed by the thread we can access its local variable.
  eg: Consider a separate which invoke some business methods we have a requirement to generate a unique transaction id for 
  each and requirement and we have to pass its transaction id to the business methods.
  for this requirement we use thread local to maintain a separate transaction id for every request that is for every thread. 
  
  Note : 
  1. Thread local class introduces in 1.2 version and enhanced in 1.5 version
  2. Thread local can be associated with thread scope
  3. Total code which is executed by the thread as access to the corresponding thread local variable
  4. A thread can access its own local variable and can't access other thread local variables.
  
  
 
 */

public class ThreadLocal10 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		
		System.out.println(t1.getName());
		t1.setName("Praveen");
		System.out.println(t1.getName());
		
		
		
	}

	
}
