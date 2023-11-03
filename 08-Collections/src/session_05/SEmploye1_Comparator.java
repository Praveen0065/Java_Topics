package session_05;

public class SEmploye1_Comparator {
	
	int id;
	String name;
	double salary;
	
	
	public SEmploye1_Comparator(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "SEmploye_Comparator [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

	
	
}
