package methodsOfStringClass6;

// Important Methods of String class: isEmpty(),length(),replace(),substring()

public class Method2 {
	
	public static void main(String[] args) {
		
		String name  = "";
		System.out.println(name.isEmpty()); // true
		
		String name1 = "Praveen";
		System.out.println(name1.isEmpty()); // false
		
		
		String D = "Dasari";
		System.out.println(D.length()); //6
		
		String test = "ababab";
		System.out.println(test.replace('a', 'c')); // all 'a'  are replaces with c
		
		String test1 = "abcdefg";
		System.out.println(test1.substring(3)); //defg
		
		System.out.println(test1.substring(3, 6)); //def
		
		
	
	}

}
