package session_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SEmployeMain2_Comparator {
	
	public static void main(String[] args) {
		
		ArrayList<SEmploye1_Comparator> al = new ArrayList<>();
		al.add(new SEmploye1_Comparator(101, "David", 15000.00));
		al.add(new SEmploye1_Comparator(105, "Putin", 25000.00));
		al.add(new SEmploye1_Comparator(103, "Cathy", 45000.00));
		al.add(new SEmploye1_Comparator(104, "Anny", 35000.00));
		
		// Collections.sort(al, new SEmployeid3_Comparator()); // sort based on id
		// Collections.sort(al, new SEmployeName4_Comparator() ); // sort based on name
		
		Collections.sort(al, new Comparator<SEmploye1_Comparator>() {

			@Override
			public int compare(SEmploye1_Comparator e1, SEmploye1_Comparator e2) {
				
				return e1.id-e2.id; // sort based on id
			}
		});  // we can  direct pass like this way or create a class and operate  
		
		
		Collections.sort(al, new Comparator<SEmploye1_Comparator>() {

			@Override
			public int compare(SEmploye1_Comparator e1, SEmploye1_Comparator e2) {
				
				return e1.name.compareTo(e2.name); //  sort based on name
			}
		});
		
		
		Collections.sort(al, new Comparator<SEmploye1_Comparator>() {  //  sort based on salary

			@Override
			public int compare(SEmploye1_Comparator e1, SEmploye1_Comparator e2) {
				  if(e1.salary > e2.salary) {
					  return 1;
				  }
				  else if (e1.salary < e2.salary) {
					  return -1;
				  }
				  else {
					  return 0;
				  }
			}
				
			});
			
		       for(SEmploye1_Comparator e : al) {
		        	System.out.println(e);
		      }
		       
	}

}
