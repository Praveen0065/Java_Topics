package session_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain_Comparable {

	
	public static void main(String[] args) {
		
		List<Student_Comparable> al = new ArrayList<>();
		al.add(new Student_Comparable(101, "John", 3));
		al.add(new Student_Comparable(104, "Praveen", 4));
		al.add(new Student_Comparable(102, "Anil", 2));
		al.add(new Student_Comparable(103, "Robert", 1));
		
		Collections.sort(al);
		
		for(Student_Comparable s1 : al) {
			System.out.println(s1);
		}
		
	}
}
