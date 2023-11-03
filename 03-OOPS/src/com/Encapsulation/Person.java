package com.Encapsulation;

// The process of grouping data members and corresponding methods into a single unit is called Encapsulation
// It is the combination of data hiding + abstraction

public class Person {
	
	private String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Dasari Praveen Kumar");
		p1.setAge(24);
		
		System.out.println("Name : " + p1.getName());
		System.out.println("Age : " + p1.getAge());
		
		
	}
	

}
