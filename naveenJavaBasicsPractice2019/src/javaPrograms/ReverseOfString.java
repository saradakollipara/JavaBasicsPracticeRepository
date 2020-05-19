package javaPrograms;

public class ReverseOfString {

	public static void main(String[] args) {

		String str = "Selenium";
		System.out.println("Given String: "+str);
		int len = str.length();
		String rev ="";
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse: "+rev);
		
		//using String Buffer Class
		//StringBuffer is a mutable Class which has reverse method
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse string buffer: "+sb.reverse());
		
		boolean pn = primeNumbers();
		if (pn == true)
			System.out.println("The given number is prime");
		else 
			System.out.println("The given number is not prime");
		
	}

	
	public static boolean primeNumbers() {
		
		int num = 98;
		int rem;
		
		if (num<=1) {
			return false;
		}
		
		for (int i =2;i<num;i++) {
			if(num%i==0) {
			
				return false;
			}
		}return true;
	}
}


