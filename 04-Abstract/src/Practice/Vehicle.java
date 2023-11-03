package Practice;

 abstract class Vehicle {
	 
	 //when we add abstract to the method the method is a incomplete method
	 // and child class is a responsible for implement 
	 public abstract int getnoofWheels();
	 public abstract int SeatCapacity();
	 
}
 
 class Bus extends Vehicle {
	  
	 public int getnoofWheels() {
		 return 6;
		 
	 }

	 public int SeatCapacity() {
		 return 50;
		 
	 }

	 
 }
 
 class Car extends Vehicle {
	 
	 public int getnoofWheels() {
		 return 4;
		 
	 }
	  public int SeatCapacity() {
		  return 4;
	  }

	 
 }
 
 
 class Bike extends Vehicle {
	 
	 public int getnoofWheels() {
		 return 2;
		 
	 }
	 
	 public int SeatCapacity() {
		 return 2;
	 }
	 

	 
 }
	
	 
class maintest {
	
	public static void main(String[] args) {
		
		Bus b1 = new Bus();
		System.out.println(b1.getnoofWheels());
		System.out.println(b1.SeatCapacity());
		
		Bike b2 = new Bike();
		System.out.println(b2.getnoofWheels());
		System.out.println(b2.SeatCapacity());
		
		Car c1 = new Car();
		System.out.println(c1.getnoofWheels());
		System.out.println(c1.SeatCapacity());
	}
}

 