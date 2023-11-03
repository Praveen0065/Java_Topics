package heapAndStringConstantPool3;

public class Part2 {
     public static void main(String[] args) {
		
    	 String s =  new String("Praveen");
    	 s.concat("Software");
    	 s = s.concat("Solutions");
    	 
    	 System.out.println(s);  // PraveenSolutions
    	 
	}
}


// total 6 Object are created 
// 3 objects are created in heap area
// 3 objects are created in scp area