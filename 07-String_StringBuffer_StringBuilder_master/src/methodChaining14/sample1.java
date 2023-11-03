package methodChaining14;

public class sample1 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Praveen").append("Dasari").reverse().insert(2, "xyz");
		System.out.println(sb);
		
	}
	
}
