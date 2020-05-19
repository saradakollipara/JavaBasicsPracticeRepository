package oopsConcepts2;

// Method Overriding : When same method is present in child class 
//as in parent class its called as method overriding.
/// Preference will be given to overridden method from child class 
//// *** Static polymorphism or Compile time polymorphism ****



public class Car extends Vehicle {

	public void start() {		
		System.out.println("In car class Start method : ");		
	}
	public void stop(){		
		System.out.println("In car class Stop method : ");		
	}
	public void refuel(){		
		System.out.println("In car class refuel method : ");
	}

	public String name() {  // Can have a return type as non-premitive data types like String, Array, 
		System.out.println("returning name");
		super.name();
		return "name";
	}	
	public Car getObject() {
		Car objC = new Car();
		System.out.println("This is Child Class getObject method.. returning Child class object");
		return objC;
	}
	public void fuelLevel() {  // this is not Overriden method as fuelLevel method is private to the Vehicle class
		System.out.println("This is Public method in Car class.. ");
	}
	public static void noOfWheels() {
		System.out.println("This is  a static method in Car class: ;");
	}
}
