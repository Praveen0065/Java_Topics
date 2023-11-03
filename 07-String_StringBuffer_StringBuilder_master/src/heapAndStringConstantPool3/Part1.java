package heapAndStringConstantPool3;

//---------------------------------------------------------------------
public class Part1 {
//                   |--------------Object1 are in heap area
//	                 V
		String s1 = new String("Praveen"); 
		
//                  |--------------Object2 are in heap area
//       	        V    
		String s2 = new String("Praveen");
//		                          ^
//		                          |___________ Object3 created in StringConstantPool area
		
		String s3 = "Praveen";       //s3 refers to object3
		
		String s4 = "Praveen";       //s4 refers to object3
	
}
    //Total 3 objects are created


//----------------------------------------------------------------------------
//What is the important of String Constant pool ?
//Same Object can be Reused for multiple times instead of creating a new object 
// memory will be saved
// performance can be improved