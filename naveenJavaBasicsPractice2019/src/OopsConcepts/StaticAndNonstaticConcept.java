package OopsConcepts;

public class StaticAndNonstaticConcept {
	
	int num = 40;
	static String name = "abd";

	public static void main(String[] args) {
		
		// call Static methods and varibles directly//// 
		pool();
		System.out.println(name);
		
		//static methods and varibles can also be called by class name
		System.out.println(StaticAndNonstaticConcept.name);
		StaticAndNonstaticConcept.pool();
		
		
		
		//Call non-static methods with objects
		
		StaticAndNonstaticConcept obj = new StaticAndNonstaticConcept();
		
		obj.carpool();
		System.out.println(obj.num);
		
		//Static methods can be called by object reference but not a good pratise. 
				obj.pool();
		

	}

	
	public void carpool() // No static method
	{
		System.out.println("From Non static method carpool");
	}
	
	public static void pool() {
		System.out.println("From Static method pool");
	}
}
