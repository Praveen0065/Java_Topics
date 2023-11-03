package com.inheritance.Hierarchical;

/* Hierarchical Inheritance in Java is a type of inheritance in Java 
where a single parent class can have multiple child classes. */

public class BaseClass {
	
	int parent  = 10;

}

class SubClass1 extends BaseClass {
	
	int child1 = 1;
}

class SubClass2 extends BaseClass {
	
	int child2 = 2;
		
}
class SubClass3 extends BaseClass{
	int child3 = 3;
	
}

class HierarchicalMain{
	public static void main(String[] args) {
		
		SubClass1 s1 = new SubClass1();
		System.out.println(s1.child1 * s1.parent);
		
		SubClass2 s2 = new SubClass2();
		System.out.println(s2.child2 * s2.parent);
		
		SubClass3 s3 = new SubClass3();
		System.out.println(s3.child3 * s3.parent);
	}
	
}