package session_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMapDemo {
	
	int id;
	String name;
	
	public StudentMapDemo(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentMapDemo [id=" + id + ", name=" + name + "]";
	}
	
	
	
	public static void main(String[] args) {
		
		StudentMapDemo s1 = new StudentMapDemo(101, "John");
		StudentMapDemo s2 = new StudentMapDemo(102, "Smith");
		StudentMapDemo s3 = new StudentMapDemo(103, "Orlen");
		
		
	   Map<Integer, StudentMapDemo> map = new HashMap<>();
	   map.put(1, s1);
	   map.put(2, s2);
	   map.put(3, s3);
	   
	   System.out.println(map);
	   
	   Set<Integer>  keyset = map.keySet();
	   for(Integer key : keyset) {
		   System.out.println(map.get(key));
	   }
		
	   Set<Entry<Integer, StudentMapDemo>> entryset = map.entrySet();
	   for(Entry<Integer, StudentMapDemo> entry : entryset ) {
		   System.out.println(entry.getKey());
		   System.out.println(entry.getValue());
	   }
		
	}


	
	
}
