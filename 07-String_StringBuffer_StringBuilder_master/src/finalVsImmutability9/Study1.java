package finalVsImmutability9;


// if a reference variable declares as final than you cant't re assign that reference variable to any new object

public class Study1 {
	
	public static void main(String[] args) {
		
		final StringBuffer s1 = new StringBuffer("Praveen");
		s1.append("Dasari");
		
		System.out.println(s1);
		
	}

}
