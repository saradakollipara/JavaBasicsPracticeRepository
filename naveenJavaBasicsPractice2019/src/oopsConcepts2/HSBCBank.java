package oopsConcepts2;

public class HSBCBank implements USBank, BrazilBank{
	
	public void credit() {
		System.out.println("HSBCBank Credit Interface method");		
	}
	
	public void debit() {
		System.out.println("HSBCBank dedit Interface method");		
	}
	
	public void creditCard() {
		System.out.println("HSBCBank Credit card Interface method");
	}
	
	public void carLoan() {
		System.out.println("HSBCBank Carloan method");		
	}

}
