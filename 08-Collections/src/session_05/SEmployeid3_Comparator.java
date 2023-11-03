package session_05;

import java.util.Comparator;

public class SEmployeid3_Comparator implements Comparator<SEmploye1_Comparator> {

	@Override
	public int compare(SEmploye1_Comparator e1, SEmploye1_Comparator e2) {
		
		return e1.id- e2.id;
		
	}

}
