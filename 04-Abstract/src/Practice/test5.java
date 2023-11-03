package Practice;


abstract class test1 {
		
		public abstract int Student();
		public abstract String indiaStates();

}

class employee extends test1 {
	     
		public int Student() {
			return 10;			
		}
	  
		public String indiaStates() {
			return "Telangana";
		}
		
		public static void main(String[] args) {
			
			employee e1 = new employee();
			System.out.println(e1.Student());
			System.out.println(e1.indiaStates()); //
		}
}
