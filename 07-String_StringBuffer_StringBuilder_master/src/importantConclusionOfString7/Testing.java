package importantConclusionOfString7;

public class Testing {
	
	public static void main(String[] args) {
		
		String s1  = "praveen";
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();
		
		System.out.println(s1==s2);  // Both are pointing to the Different objects
		System.out.println(s1==s3); // Both are pointing to the same Object
		
	}

}


/// Total 3 objects are created


// Once we Create our Object no one is allowed to change the content
// if any person trying to change the content > those changes a new object will be created
// if there is no changes existing content will be Reusable.