package com.Polymorphism;

// Single entity having multiple forms is called as Polymorphism
// There are two types of Polymorphisms

//1 --> Static / compile time / Early Binding    eg( Method OverLoading )
//2 --> Dynamic / Run Time / Late Binding        eg( Method OverRiding )

//----------------------------------------------------------------------------

class Bird {
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird {
	public void sing() {
		System.out.println("One two One Two three..! ");
	}
}

class Morgan extends Robin{
	public void sing() {
		System.out.println("Twin twin twin..! ");
	}
}


public class Polymorphism {
	
	public static void main(String[] args) {
		Morgan b1 = new Morgan();
		b1.sing();
				
	}

}
