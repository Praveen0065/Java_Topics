package whatIsThread2;

public class thread1 {

}

/*

1.What is thread ?
 A thread is a flow of execution
 for every thread a separate independent job is there
 
 2. How many ways to define a Thread ?
  There are two ways
  1 --> By extending a threadClass
  2 --> By implementing runnable interface 




        
         ********************* THREAD LIFE CYCLE *************************************************************************
        

   Thread t = new Thread();
  |----------------|                |----------------|   If Thread Scheduler    |----------------|                         |----------------| 
  |                |                |                |     allocated the        |                |  If run() method        |                | 
  |                |  t.start()     |                |      Processor           |   Running      |   Completed             |                | 
  |     New/Born   |--------------->| Ready/Runnable | ------------------------>|                |------------------------>|     Dead       |  
  |                |                |                |                          |                |                         |                | 
  |                |                |                |                          |                |                         |                | 
  |----------------|                |----------------|                          |----------------|                         |----------------| 

 


 




*/