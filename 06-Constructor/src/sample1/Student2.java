package sample1;

public class Student2 {

	
        Student2() {
			System.out.println("Constructor");
		}

        public static void main(String[] args) {
			Student2 s1  = new Student2();
			Student2 s2  = new Student2();
			Student2 s3  = new Student2();
		}
}
/* OUTPUT

Constructor
Constructor
Constructor

*/
