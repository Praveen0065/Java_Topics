package practiceQuestions10;

public class Question5 {
	
	public static void main(String[] args) {
		
		String s1 = "Java";
		
		String s2 = new String("java");
	   
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equal...");
		}
		else
		{
			System.out.println("Not Equal...");
		}
		
	}
	

}
