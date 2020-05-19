package javaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		//If the given number is equal to sum of its digits each raised to the power of the no.of digits in it
		//153,371,407,9474,54748

		int number = 5;
		int copy = number;
		int numOfDigits = String.valueOf(number).length();
		int sum =0;
		System.out.println("Number of digits in " +number + " are :" + numOfDigits);
		
//		while(copy != 0) {
//			int lastDigit = copy %10;
//			int lastDigitToThePowerOfDigit = 1;
//
//			for(int i=0;i<numOfDigits;i++) {
//				lastDigitToThePowerOfDigit = lastDigitToThePowerOfDigit * lastDigit;
//			}
//			sum = sum + lastDigitToThePowerOfDigit;
//			copy = copy /10;
//		}
		
		while(copy != 0) {
			int lastDigit = copy %10;
			sum = sum + (lastDigit*lastDigit*lastDigit);
			copy = copy /10;
		}
		
		if (number == sum) {
			System.out.println("The given number is Armstrong Number");
		}
		else {
			System.out.println("The given number is not an Armstrong Number");
		}
	}
	
	

}


