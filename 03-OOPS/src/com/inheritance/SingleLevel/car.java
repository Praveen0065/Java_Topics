package com.inheritance.SingleLevel;

// child class inheriting parent class properties and behaviour 


public class car {
	
	public void CarBrand() {
		System.out.println("The car was Audi");
	}

}

class maruthi extends car {
	
	public void CarModel() {
		System.out.println("Older version");
	}
}

class Maincar {
	public static void main(String[] args) {
		maruthi m1 = new maruthi();
		m1.CarModel();
		m1.CarBrand();
		
	}
}