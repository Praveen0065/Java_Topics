package session_01;

import java.util.ArrayList;

public class Part1 {

}

/*
    
    ************** COLLECTIONS AGENDA ******************
    
    1. Why we need to go for collections
    2. What is collection framework
    3. Collection Hierarchy
    4. List interface & implementations
    5. Set interface & implementations
    6. Queue interface & implementations
    7. Map interface & implementations
    8. Cursors
    9. Collections Sorting
    
    ===========================================
    
    
    ================================
    Approach -1 : Primitive Data Types 
    ================================
    
    variables --> to store the data
    
    data type --> type of data that we can store in variable
      
      1) Primitive data types (byte,short,int,long,float,double,char,boolean)
      2) referenced data type (Arrays, String,class etc..)
      
        
        int a =10;
        
        int b = 20;
        
        int c = 30;
        
    I want to store 1000 values ? -- 1000 variables we need
    
    I want to store 1lakh values ? -- 1lakh variables we need
    
    --> To overcome this problem we introduced ==> Arrays
    
    ===================
    Approach -2 : Arrays
    ===================
    
    --> We can store group of values in a single variable
    
    int[]a = new int[5];
      
    arr[] = 10;
    arr[] = 20;
    arr[] = 30;
    arr[] = 40;
    arr[] = 50;
    
    five values into a single Arrays
    
    ** Disadvantages of Arrays we have some Limitations
   
    ----------
    Limitations
    ----------
    1) Arrays are fixed in a size
    2) We can store only homogeneous values ( Same type of values )
    
    Student s[] = new Student [100];
    
    s[0] = new Student(10, "Raju"); // valid
    s[1] = new Student(11, "Rani"); // valid
    s[2] = new Employee(101, "Ramesh"); // InValid
    s[99] = new Student(999, "Praveen"); // valid

    ==========================
    Approach -3 : Object Array
    ==========================
    
    Object is super class for all the classes
    
    Object []a = new Object [100];
    
    a[0] = new Student(10, "Raju", ); // valid
    a[1] = new Student(11, "Rani"); // valid
    
    a[2] = new Employee(10, "Raju",1000.00); // valid
    a[3] = new Employee(11, "Rani",2000.00); // valid
    
    a[4] = new Customer(10, "Raju",1000.00); // valid
    a[5] = new Customer(11, "Rani",2000.00); // valid
    
    Homogeneous problem is resolved.
    
    
    --> Size is fixed.
    --> insert, update, retrieve, sort the data common operations are not supported
    
    ** To overcome these problems,  we are going for a concept called  COLLECTIONS. ** 
    
    ---------------------------------------------------------------
    
    COllECTIONS :
    --> Collections are used to store  group of objects / values.
    --> Collections are growable in nature ( dynamically size can be increased and decreased based on data ).
    --> We can store any type of data in collection ( Homogeneous & Heterogeneous )
    --> Collections providing predefined methods to insert,update,delete,retrieve,sort etc..
    --> Collections is a entity / Container which is used to store group of objects.
    
    --> Collections we are calling Collections FrameWork
        Framework means ready made software.
        
        eg : Biryani we have prepare all things separately 
             Maggie we can cook in 2 minutes 
             so here Maggie is like a framework
    
        Collections is called as framework because it is providing predefined interfaces,classes and methods to perform operation on data.
    
    ===================================
     3. Collection Hierarchy
    ===================================
    
    0) Iterable(I)
    1) Collection(I)
    2) List(I)
    3) Set(I)
    4) Queue(I)
    
    5) Map(I)
    
    =======================
    Collection interface
    =======================
    
    -> It is super interface for List,Set and Queue
    -> Collection interface providing several methods to store and retrieve objects 
    
    1) add(Object obj) : store one obj
    2) get(int index) : get obj
    3) remove(int index) : remove obj
    4) set(int index, Object obj) : insert obj using index
    5) indexOf(Object obj) : first occurence of obj
    6) lastIndexOf(Object obj) : last occurence of obj
    7) listIterator() : to iterate collection objs
    
    
    List  : It is used to store  group of objects  ( duplicates are allowed )
           
           classes
          1) ArrayList
          2) LinkedList
          3) Vector
          4) Stack
    
    Set   : It is used to store  group of objects ( duplicates are not allowed )
           
          1) HashSet
          2) LinkedHashSet
          3) TreeSet
          
    
    Queue : It is used to store  group of objects ( FirstIn FirstOut FIFO )
    
          1) PriorityQueue
    
    Map   : It is used to store  group of objects ( Key-Value pair )
          
          1) HashMap
          2) LinkedHashMap
          3) HashTable
          4) TreeSet
          5) IdentityHashMap
          6) WeakHashMap
          
    ===========
    Cursors
    ===========
    Cursors are used to iterate collections (retrieve data from collections)
    1) Iterator
    2) ListIterator
    3) Enumeration
    
    Collections framework related classes & interfaces are part of java.util package
       
       
    
    
 
    
 */



