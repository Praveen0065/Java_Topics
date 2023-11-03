
package needOdStringBuffer11;

// all required changes will be performed in existing object only

public class Tester {
	
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Praveen");
		s1.append("Kumar");
		s1.append("Dasari");
		
		System.out.println(s1);
		
	//------------------------------------------------------------
		
		//Constructor 
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //16
		
	}

}
