package abstractionConcept;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank objHDBank = new HDFCBank(); // static polymorphism
		objHDBank.credit();
		objHDBank.debit();
		objHDBank.loan();
		objHDBank.funds();
		System.out.println(Bank.str); // accessing static variable in Abstract class
		
		Bank objBank = new HDFCBank();  //Dynamic polymorphism
		objBank.credit();
		objBank.credit();
		objBank.loan();
		
		// Bank objBank = new Bank(); // cannot create object of an abstract class
		
		
	}
	
	

}
