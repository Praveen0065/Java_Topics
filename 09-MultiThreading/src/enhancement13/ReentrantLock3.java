package enhancement13;

import java.util.concurrent.locks.ReentrantLock;

/*
Reentrantlock()
It is the implementation class of lock interface and it is the direct child class of object.

1. Reentrantlock means a thread can acquired same lock multiple times without any issue 
  internally Reentrantlock increment threads personal counts whenever we call lock method
  and decrement count value is whenever thread calls unLock method and lock will be released 
  whenever count reaches ZERO



 1.     Reentrantlock l = new Reentrantlock();
        creates instance of Reentrantlock
      
      
 2.     Reentrantlock l = new Reentrantlock(boolean fairness);
 note : the default value for fairness is false


*/


public class ReentrantLock3 {
	public static void main(String[] args) {
		
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		System.out.println(l.isLocked()); //true
		System.out.println(l.isHeldByCurrentThread()); // true
		System.out.println(l.getQueueLength()); //0
		l.unlock();
		
		System.out.println(l.getHoldCount()); //1
		System.out.println(l.isLocked()); //true
		l.unlock();
		System.out.println(l.getHoldCount()); //0
		System.out.println(l.isLocked()); //false
		System.out.println(l.isFair()); //false
		
	}

}
