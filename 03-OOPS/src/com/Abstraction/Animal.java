package com.Abstraction;

// Hiding the internal Implementation and showing the setup services are called as abstraction. (or)
// Abstraction is the process of hiding method implementation and showing the functionality to the user

//Abstract class
abstract class Animal {
	
	// Abstract method (does not have a body)
	public abstract void AnimalSound();
	
	// Regular Method
	public void sleep() {
		System.out.println("zzzz");
	}
	

}

//Subclass (inherit from Animal)
class dog extends Animal {
	
	public void AnimalSound() {
		System.out.println("Dog is saying Bow Boww Bowww..!");
	}
	
}

class AbstractionMain {
	public static void main(String[] args) {
		
		dog d1 = new dog();
		d1.sleep();
		d1.AnimalSound();
		
	}
}

