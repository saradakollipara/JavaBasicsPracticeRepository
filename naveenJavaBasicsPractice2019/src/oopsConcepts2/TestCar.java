package oopsConcepts2;

public class TestCar {

	public static void main(String[] args) {

		Bmw objBmw = new Bmw(); 
		/// ///   we can call the parent class methods with child class reference variable
		objBmw.start(); // overrriden method from child class is called  
		objBmw.stop();
		objBmw.refuel();  
		objBmw.threftsafty(); //BMW own method 
		objBmw.engine();  // Super class method

		objBmw.getObject(); // calls child class method 
		//	Bmw objBmw2 = (Bmw) objBmw.getObject();  //Down casting
			
		//		objBmw2.start();
		//		objBmw2.stop();
		objBmw.fuelLevel();  // with private keyword
		
		System.out.println("*************");

		Car objCar = new Car(); // Parent class methods can be called with parent class object
		objCar.start();
		objCar.stop();
		objCar.refuel();
		objCar.engine();  
		objCar.fuelLevel();
		Car objCar3 = objBmw.getObject();
		objCar3.start();
		objCar3.engine();
		objCar3.refuel();
		Car.noOfWheels();  // static method
		
		System.out.println("*************");

		Car objCar2 = new Bmw(); //Top Casting
		// Dynamic polymorphism / Runtime polymorphism
		// creating object of child class with parent class ref variable 
		// only common methods and parent methods can be accessed 

		objCar2.start();  // child method is called //overriden method
		objCar2.stop();
		objCar2.refuel();
		objCar2.engine();
		// objCar2.threthreftsafty(); this method can not be called with parent class ref variable

		//Down Casting
		//Bmw objBmw3 = (Bmw)new Car();
		// This will compile but at runtime will throw an exception "ClassCastException"
		
		System.out.println("*************");

		Vehicle objVehicle = new Vehicle();
		objVehicle.engine();
		objVehicle.name();
		//objVehicle.fuelLevel();  -- cannot access as the method is private 
		Vehicle objVehicle2 = objVehicle.getObject();
		objVehicle2.engine();
		objVehicle2.name();	
		Vehicle.noOfWheels();  // static method
		System.gc(); // Garbage collector is called to recycle unused objects
	}
}

