package Practice;

public class MethodSignature {
	
	public void m1(int a) {
		System.out.println("a : " + a );
		
	}
	
	public void m1(String name) {
		System.out.println("name : " + name);
		
	}
	
	

}
class mainSignature {
	public static void main(String[] args) {
		MethodSignature m1 = new MethodSignature();
		m1.m1(15);
		m1.m1("Praveen");
	}
}
