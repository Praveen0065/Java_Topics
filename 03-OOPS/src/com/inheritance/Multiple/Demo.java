package com.inheritance.Multiple;

/*Multiple inheritance in java is the capability of creating a 
single class with multiple superclasses.*/

public interface Demo {
	
	public void execute(int a);

}

interface test {
	public void execute(int a);
}

class jump implements Demo,test {

	
	public void execute(int a) {
		System.out.println("Hello.. From Implementation Class!!");
		System.out.println(a);
	}
	
	
}

class mainMultiple {
	public static void main(String[] args) {
		jump j1 = new jump();
		j1.execute(20);
		}
	}