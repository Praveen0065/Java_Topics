package creationOfOurOwnImmutableClass8;

// Creation of Our Own Immutable Class is possible

public class Sample {
	
	private int i;
	
	Sample(int i){
		
		this.i =i;
		
	}
	public Sample modify(int i) {
		
		if(this.i==i) {
			return this;
		}
		else
		{
			return new Sample(i);
		}
	}
	public static void main(String[] args) {
		
		Sample s1 = new Sample(10);
		Sample s2 = s1.modify(100);
		Sample s3 = s1.modify(10);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		
	}

}
