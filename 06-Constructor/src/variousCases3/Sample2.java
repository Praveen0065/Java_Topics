package variousCases3;

// super() parent class variables
// this() current class variables

public class Sample2 {
	
	String s = "Parent variable";

}
class Sample3 extends Sample2 {
	
	String s = "Child variable";
	
    public void test() {
    	
        System.out.println(s); // Child variable
    	System.out.println(this.s); // Child variable
    	System.out.println(super.s); // Parent variable
    }
	
	
}
class MainSample2 {
	
	public static void main(String[] args) {
		
		Sample3 s1 = new Sample3();
		s1.test();
		
	}
}