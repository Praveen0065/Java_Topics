package methodsOfStringBuffer12;

//Important Methods of StringBuffer class: length(),capacity(),charAt(),setCharAt(),append()

//  Important Methods of StringBuffer class: insert(),delete(),deleteCharAt(),reverse()

public class testing1 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Dasari");
		
		System.out.println(sb.length());   //6
		
		System.out.println(sb.capacity());  // 22
		
		System.out.println(sb.charAt(2));  //s
		
		System.out.println(sb.append("Praveen")); // DasariPraveen
		
	//	System.out.println(sb.setCharAt(4, 5));	
		
		sb.insert(2, "xyz");
		System.out.println(sb); //DaxyzsariPraveen
		
		sb.delete(2, 4);
		System.out.println(sb);  //DazsariPraveen
		
		
		StringBuffer s2 = new StringBuffer("abcdefgh");
		s2.deleteCharAt(3);
		System.out.println(s2);  //abcefgh
		
		StringBuffer s3 = new StringBuffer("Deva");
		s3.reverse();
		System.out.println(s3);  //aveD
		
		
	}
	
	

}
