package sample1;

/*
  Constructor concept is specially created to perform initialization of an object

 */

public class Student1 {
	
	String name;
	int rollno;
	
	//constructor 
	Student1(String name, int rollno){
		this.name = name;
		this.rollno =rollno;		
	}
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1("Praveen", 101);
		Student1 s2 = new Student1("Dasari", 103);
		
		System.out.println(s1.name + ".." + s1.rollno);
		System.out.println(s2.name + ".." + s2.rollno);
	}
	

}
/* OUTPUT
 
Praveen..101
Dasari..103


 */
