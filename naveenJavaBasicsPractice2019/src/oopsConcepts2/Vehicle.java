package oopsConcepts2;

public class Vehicle { //Parent class
	
	public void engine() {
		System.out.println("This is Super class Engine method : ");
	}

	public Object name() { // This Super class method has Covariant return Type
		String name = "sarada";
		return "0";
	}
	// Returning Vehicle type object
	public Vehicle getObject() {
		Vehicle objV = new Vehicle();
		System.out.println("This is Super Class getObject method.. returning Super class object");
		return objV;
	}
	
	private void fuelLevel() {  // This is specific to this class only
		System.out.println("This is private method od Vehicle class.. ");
	}
	
	public static void noOfWheels() {
		System.out.println("Static method in Vehicle class.. ");
	}
	
}
