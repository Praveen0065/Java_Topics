package variousCases3;

/*
 
  1. super() --> we can use only inside constructors
  2. this() --> we should use only in first line
                we can use only one but not with simultaneously.
  
  
 
 
 
 */


public class Sample1 {
	
	 Sample1() {
		 
		 super();
		 System.out.println("Constructor1");
	
		
	}
	 public static void main(String[] args) {
		Sample1 s1 = new Sample1();
	}

}
