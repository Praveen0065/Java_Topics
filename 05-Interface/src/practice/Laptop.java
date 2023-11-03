package practice;

// Interface is a blue print of a class
// eg :only we have to tell what to do ?

public interface Laptop {
    
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	
	//new feature
	public static void audio() {
		System.out.println("Laptop audio");
	}
}

// like a business document 
// preparing only what to do. and implementation are in the classes