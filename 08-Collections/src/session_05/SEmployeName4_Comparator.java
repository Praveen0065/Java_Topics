package session_05;

import java.util.Comparator;

public class SEmployeName4_Comparator implements Comparator<SEmploye1_Comparator> {

	@Override
	public int compare(SEmploye1_Comparator e1, SEmploye1_Comparator e2) {
		
		return e1.name.compareTo(e2.name);
	}

}
