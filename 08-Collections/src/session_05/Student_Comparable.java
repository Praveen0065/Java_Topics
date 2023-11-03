package session_05;

public class Student_Comparable implements Comparable<Student_Comparable> {
	
	int id;
	String name;
	int rank;
	
	public Student_Comparable(int id, String name, int rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
	}

	@Override
	public int compareTo(Student_Comparable s) {
		// return this.id - s.id ; // based on the id we are sorted
		//return this.name.compareTo(s.name); // based on the name we are sorted
		return this.rank - s.rank;  // based on the rank we are sorted
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	
	
	

}
