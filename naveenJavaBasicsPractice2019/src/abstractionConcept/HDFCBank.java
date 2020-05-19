package abstractionConcept;

public class HDFCBank extends Bank{
	
	public void loan() {  //the abstract method in parent class should be defined in the child class
		System.out.println("HDFC -- Overriden loan method");
	}
	
	public void funds() {
		System.out.println("HDFC - funds methos");
	}
	
}
