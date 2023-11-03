package StringBuffer2;

//String object are mutable

/*  Once we create stringBuffer object. we can perform any changes 
    So this changeable behaviour is nothing but mutability
*/

public class Demo1 {

	 public static void main(String[] args) {
		StringBuffer s2 = new StringBuffer("Praveen");
		s2.append("Dasari");
		System.out.println(s2);
		
	}
}
