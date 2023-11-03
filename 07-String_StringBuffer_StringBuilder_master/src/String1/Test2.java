package String1;


// == operator always meant for reference comparison
// reference comparison means if the both references pointing to the same object.
// then only it returns true.

// In the case  string .equals method always meant for content comparison
// In the String class .equal method over riden for content comparison


public class Test2 {

	public static void main(String[] args) {
		
		String s1 = new String("Praveen"); // object1
		String s2 = new String("Praveen"); // object2
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2));
	}
	
}
