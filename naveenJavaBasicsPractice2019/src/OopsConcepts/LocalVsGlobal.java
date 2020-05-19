package OopsConcepts;

public class LocalVsGlobal {
	
	//Global Variables or Class variables
	 // can be accessed only an object is created for the class
	String name = "Shar";
	int age = 40;

	public static void main(String[] args) {

		int i = 10; // Local varibles
		
		System.out.println(i); // local varible to main method
		
		LocalVsGlobal obj = new LocalVsGlobal();
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		obj.sum();
		
		
	}

	public void sum() {
		
		// Local variables, scope is with in the method
		int i =10;
		int j = 20;
		int age = 25;
		
		System.out.println(i +" " + j + " " + age) ;
	}
}
