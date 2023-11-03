package enhancement13;

// package java.util.concurrent

/*
 
 The Problems with traditional synchronized keyword
 1. We are not having any flexibility to try for a lock without waiting
 2. There is no way to specify maximum waiting time for a thread to getlock so that thread will wait until getting the lock
    which may create performance problem which may cause dead lock.
 3. If a thread releases lock than which waiting thread will get locks we are not having control on this
 4. There is no API to list out all waiting threads for a lock.
 

 */
/*
 Methods 
 
 1. void lock();
 We can use this method to acquired a lock if lock is already available than immediately current thread will get that lock.
 if the lock is not already available it will wait until getting the lock it is exactly same behavior of traditional synchronized keyword.
 
 3. boolean trylock();
 To acquired the lock without waiting 
 if the lock is available than the thread acquired to that lock and returns true.
 if the lock is not available than this method returns false and continue it execution without waiting.
 in this case thread never be entered into waiting state.
 
 */


public class JavaUtil2 {

}
