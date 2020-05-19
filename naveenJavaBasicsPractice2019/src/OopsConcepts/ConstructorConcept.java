package OopsConcepts;

public class ConstructorConcept {
	
	//Constructor can not return any value. There is no return type while creating a constructor
//			Constructor name ane class name should be the same
//			Constructor with no parameters is called as Default Constructor
//			Constructor is called when we create an object to that class 
//			Even if we do not define a default constructor a hidden default constructor is always called when we create object to that particular class
//			Constructor can be overloaded
//			Global variables can be initialized inside the constructor with this keyword
	
	// 		Constructors are used to initialized class properties like methods and variables
	//		by creating different objects to the constructor with same parameters we can initialize different properties to the same class variables
	
	//		When we create a constructor in parent class and also child class,
	//			then create object for the child class, both parent class(first) and child class (second)constructors are called
	//		TestBase class  --> loginPage class [Page object model]
	
	//		Super keyword is used to call parent class constructor other than default constructor
	//			depending on the parameters, 
	//				this should be done in child class constructor and should be the first statement in child class constructor super(20)
	//					we can not call more than one constructor from child class - no two super keywords at same time
	//						for this we have to create one more constructor in child class calling the other constructor
	int age;
	String name;

	public static void main(String[] args) {
		
		ConstructorConcept objConstructorConcept = new ConstructorConcept();
		ConstructorConcept objConstructorConcept2 = new ConstructorConcept(10); // Constructor Overloading
		ConstructorConcept objConstructorConcept3 = new ConstructorConcept("Tim",30);
		System.out.println(objConstructorConcept3.name); //accessing global variables which are initialized in constructor
		System.out.println(objConstructorConcept3.age);
	}

	
	public ConstructorConcept() {  // Default constructor
		System.out.println("Calling Default Constructor with no parameters....");
	}
	
	public ConstructorConcept(int a) { // Constructor Overloading
		System.out.println("calling Constructor with single parameter... " + a);	
	}
	
	public ConstructorConcept(String name,int age) {
		System.out.println("Global variables are initialized");
		this.age = age; // this keyword is used to initialize the global variables to local constructor variables
		this.name= name;
		//System.out.println(name);
		//System.out.println(age);
	}
}
