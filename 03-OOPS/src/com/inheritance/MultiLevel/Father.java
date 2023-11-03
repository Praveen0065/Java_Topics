package com.inheritance.MultiLevel;


public class Father {
	
	public void father() {
		System.out.println("I am head of house");
	}

}

class Son extends Father {
	
	public void son() {
		System.out.println("I am son");
	}
	
	
}

class GrandSon  extends Son {
	
	public void grandSon() {
		System.out.println("I Am Grand son ");
		
	   father();
		 son();
		
		
	}
}


 class Main {
	 
	 public static void main(String[] args) {
		GrandSon g2 = new GrandSon();
		//g1.father();
		//g1.son();
		g2.grandSon();
		
		
		
				
	 }
 }
	
 
 