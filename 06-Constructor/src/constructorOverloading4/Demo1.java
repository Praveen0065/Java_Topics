package constructorOverloading4;

/*
 1. Within the class we can write n number of constructors.
 2. Inheritance and Over Riding concepts are not applicable for Constructor.
 
 */

public class Demo1 {
	
	 Demo1(double d) {
		 this(10);
		 System.out.println("Double Arg constructor");
	}

     Demo1(int i) {
    	 this();
        System.out.println("Int Arg constructor");		
	}
     
     Demo1() {
		System.out.println("No Arg constructor");
	}
     
     public static void main(String[] args) {
    	 
		Demo1 d1 = new Demo1(15.5);
		Demo1 d2 = new Demo1(15);
		Demo1 d3 = new Demo1();
				
	}

}
