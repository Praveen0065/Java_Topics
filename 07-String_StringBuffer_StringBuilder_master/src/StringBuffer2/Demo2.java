package StringBuffer2;

// == operator if the both references pointing to the same object.
// then only it returns true. otherwise get false

// When stringBuffer .equals method Calls. It will call Object class .equals method
// Object class .equals method is always meant for Reference comparison


public class Demo2 {
	
	public static void main(String[] args) {
		   
		StringBuffer s1 = new StringBuffer("Praveen"); //object
		StringBuffer s2 = new StringBuffer("Praveen"); // object
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2));
		
	}

}
