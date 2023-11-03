package methodsOfStringClass6;

import java.util.Scanner;

// Important Methods of String class: indexOf(),lastIndexOf(),toLowerCase(),toUpperCase(),trim()

public class Method3 {
	
  public static void main(String[] args) {
	
	  String name  ="Praveen";
	  System.out.println(name.indexOf('a'));
	  
	  String name1 = "abbabb";
	  System.out.println(name1.lastIndexOf('a'));
	  
	  String name2  = "PRAVEEN";
	  System.out.println(name2.toLowerCase());
	  
	  String name3  = "praveen";
	  System.out.println(name3.toUpperCase());
	  
	 //=======================================================================
	 // best example for tolowercase method
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please Enter City Name : ");
	  
	  // Trim method clear begin spaces and end spaces but not middle space
	  
	  String name5 =  sc.nextLine().toLowerCase().trim();
	  
	  if(name5.equals("hyderabad")) {
		  System.out.println("Hyderabadi ,Namaste, Adaabb");
	  }
	  else if (name5.equals("chennai")) {
		  System.out.println("Hello, Chennai , Vankkam");
	  }
		  
	  else if (name5.equals("bagalore")){
			  System.out.println("hello, bengalore");
		  }
	  else {
		  System.out.println("Invalid Input");
	  }
	}
	  
	  
}


