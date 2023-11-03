package Practice;

// when we declares abstract  the class must be incomplete

abstract class Country {

	public abstract int india();
		
}
class test extends Country {
	
	public int india(){
		return 29;
	}

}
class Main {
	public static void main(String[] args) {
		
		test t1 = new test();
		
		System.out.println(t1.india());
		
	}
}
