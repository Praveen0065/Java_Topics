package heapAndStringConstantPool4;

public class Sample1 {
	
	public static void main(String[] args) {
		
		String s1 = new String("You cannot change me");   // s1 is focusing new object
		String s2 = new String("You cannot change me");   // s2 is focusing another new object		
		System.out.println(s1 == s2);
		// both are focusing different objects so output is false
		
		String s3 = "You cannot change me";
		System.out.println(s1 == s3);
		// both are focusing different objects so output is false
		
		String s4 = "You cannot change me";
		System.out.println(s3 == s4);
		// both are focusing same object so output is true
		
		String s5 = "You cannot"+"change me";
		System.out.println(s4 == s5);
		
		String s6 = "You cannot";
		String s7 =s6+"change me";
		System.out.println(s4 == s7);
		
		final String s8 = "You cannot";
		String s9 = s8+"change me";
		System.out.println(s4==s9);
		
		
	}

}
