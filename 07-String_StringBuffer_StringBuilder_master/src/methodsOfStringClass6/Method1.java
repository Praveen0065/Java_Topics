package methodsOfStringClass6;

//Important Methods of String class: charAt(), concat(), equals(), equalsIgnoreCase()

public class Method1 {
	
	public static void main(String[] args) {
		
		String name = "Praveen";
		System.out.println(name.charAt(5));
		
		
		String s = "Dasari";
		s= s.concat("Deva");
		System.out.println(s);
		
		String s1 = "PRAV";
		System.out.println(s1.equals("prav")); //false
		System.out.println(s1.equalsIgnoreCase("prav")); // true
		
		// Real Time scenario .equalSIgnoreCase like UserName
		//                    .equals Method like passWord
	}

}
