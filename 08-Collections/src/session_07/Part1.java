package session_07;

// It is not the part of collections 

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Part1 {
	
	/*
	 
	 =================
	 java.util.package
	 =================
	 
	 java.util.Scanner
	 
	 java.util.StringTokenizer
	 
	 java.util.Date
	 
	 java.util.Calender
	 
	 
	 */
	
	//---------------------------------------------------------------
	  
	// => Scanner class available in java.util.Package
	// => Using Scanner we can read data from keyboard
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter firstNumber  : ");
		int i = sc.nextInt();
		
		System.out.println("Enter SecondNumber  : ");
		int j = sc.nextInt();
		
		System.out.println("Result  :  "+ i+j);
		System.out.println("========================");
		
		//-----------------------------------------------------
		
	// => StringTokenizer is a predefined class available in java.util.package
	// => Using this class we can split string into multiple token based on delimiter
		
		String s = "Java Programming Course";
		StringTokenizer st = new StringTokenizer(s, " ");
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		System.out.println("========================");
		//-----------------------------------------------------
		
		// java.util.Date & java.util.Calender
		
		
		 Date d = new Date(0);
		 System.out.println(d);
		 
		 Calendar c = Calendar.getInstance();
		 System.out.println(c.get(Calendar.YEAR));
		 System.out.println(c.get(Calendar.HOUR_OF_DAY));
		
		
		
		
		
		
	}

}
