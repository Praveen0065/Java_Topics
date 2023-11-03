package threadCommunication9;

public class ThreadComIntro1 {

}
/*
1.Two threads can communicate which each other by using wait() and notify() and notifyAll()

The thread which is expecting updation is responsible to call wait method than immediately
the thread will entered into waiting stage.

The thread which is responsible to perform updation, after perform updation it is responsible
to call notify method. Than waiting thread will get notification can continue its execution 
with those updated items.


2.**  wait() and notify() and notifyAll() are Present in object class **
  
    Because thread can calls this methods on any java object
   
3. if a thread calls wait method on any object it immediately releases the lock of the particular object
and entered into waiting stage.

4. if a thread calls notify method on any object it releases the lock of that object but may not immediately
except wait notify and notify arg there is no other method where thread release the lock.

5. D/w notify and notifyAll
we can use notify method to give the notification for one waiting thread 
if multiple thread are waiting than only one thread will be notify and the remaining threads have to be wait
for further notifications
which thread will be notify we can't expect it depends on JVM.
*/