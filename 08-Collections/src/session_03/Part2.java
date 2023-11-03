package session_03;

import java.util.ArrayDeque;

public class Part2 {
	
	public static void main(String[] args) {
		
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("one");
		ad.add("two");
		ad.add("Three");
		ad.addFirst("praveen");
		
		System.out.println(ad);
		
		ad.pollFirst();
		System.out.println(ad);
		
		ad.pollLast();		
		System.out.println(ad);
		
	}

}
