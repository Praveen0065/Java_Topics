package methodsOfStringBuffer12;

// Important Methods of StringBuffer class: setLength(),ensureCapacity(),trimToSize()

public class testing2 {
     public static void main(String[] args) {
		
    	 StringBuffer s1 = new StringBuffer("PraveenDasari");
    	 s1.setLength(7); 
    	 System.out.println(s1); //Praveen
    	 
    	 
    	 StringBuffer s2 = new StringBuffer();
    	 System.out.println( s2.capacity());
    	 
         StringBuffer s3 = new StringBuffer(1000);
         s3.append("ABC");
         System.out.println(s3.capacity());
         s3.trimToSize();
         System.out.println(s3);
    	 
    	 
    	 
	}
}
