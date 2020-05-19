package abstractionConcept;

public abstract class Bank { 
	
	int a = 10;
	static String str = "name";
	final int b = 20;
		
		//Use Abstract class if you want to use partial Abstraction
				// i.e., some implementation logic is to be hided
	
		//Abstraction is hiding the implementation logic
		//abstract keyword is used to define abstract class
	    // atleast one abstract method should be there in an abstract class
		//abstract class can have non-abstract methods too
		// Cannot create object of abstract class
		//Static, non-static or final variables can be defined in an Abstract class
	
	public abstract void loan();  // abstract method does not have method body
								// also called as partial abstraction as all methods need not to be abstract
	public void credit() {
		System.out.println("Non-abstract credit method");
	}

	public void debit() {
		System.out.println("Non-abstract debit method");
	}
}
