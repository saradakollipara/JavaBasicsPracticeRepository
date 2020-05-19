package oopsConcepts2;

public class TestBank {

	public static void main(String[] args) {

		HSBCBank objHSBCBank = new HSBCBank();
		objHSBCBank.credit();
		objHSBCBank.debit();
		objHSBCBank.carLoan();
		objHSBCBank.creditCard();
		
		
		USBank objUSBank = new HSBCBank(); // Dynamic polymorphism/ Runtime Polymorphism
		   /// Only overridden methods will be called from child class
		objUSBank.credit();
		objUSBank.debit();		
		
	}

}
