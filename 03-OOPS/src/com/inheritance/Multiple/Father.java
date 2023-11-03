package com.inheritance.Multiple;

/*Multiple inheritance in java is the capability of creating a 
single class with multiple superclasses.*/

public interface Father {
	
	public abstract void perform();
	
}

interface Mother {
	
	public abstract void perform1();	
}

class child implements Father,Mother {
	
	public void perform() {
		System.out.println("Head of house..!");
	}

    public void perform1() {
    	System.out.println("House Wife..!");
    }
	 
}

class MultipleMain {
	public static void main(String[] args) {
		child c1 = new child();
		c1.perform();
		c1.perform1();
	}
}
