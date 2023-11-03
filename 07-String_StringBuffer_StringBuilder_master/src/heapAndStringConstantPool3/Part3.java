package heapAndStringConstantPool3;

public class Part3 {
	
	public static void main(String[] args) {
		
//		                           |---------------------- String Literal
//		                           V
		String  s1 = new String("Spring");
		s1.concat("fall");
		String s2 = s1.concat("Winter");
		s2.concat("Summer");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}

// 8 objects are created in this program 
// 4 in heap area
// 4 in scp area

// For every new operator one object is created in heap area
// for every string literal one object is created in scp area

/*
          Heap         |  String Constant Pool (Scp)
    ___________________|___________________   
                       | 
    S1--> Spring       |    Spring
                       |
  Gc -> SpringFall     |    fall                               Gc means Garbage Collector
                       |
  s2--> SpringWinter   |    Winter
                       |
Gc-> SpringWinterSummer|   Summer
                       |
                       |
                                                                   */