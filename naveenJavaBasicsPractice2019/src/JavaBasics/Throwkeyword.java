package JavaBasics;

public class Throwkeyword {
	
	private int i;
	private double a;
	public int add() {
		i = 20 +30;
		System.out.println(i);
		return i;
	}
	public double div() throws ArithmeticException {
		int b = add();
		System.out.println(b);
		a = b/0;
		System.out.println(a);
		return a;
	}
	

	public static void main(String[] args) throws ArithmeticException{

		/* Throw keyword is used to handle the exceptions
		 * 		Used to throw user defined Exception
		 * 		catch by using try catch block
		 * Throws keyword is used in front of the method and 
		 * 		Cought by JVM  		
		 * 
		 */

		System.out.println("Throw keyword Demo..");
		try {
			throw new Exception("My Own Exception.");
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		System.out.println("Lines of code after Exception...");
		
		Throwkeyword objThrowkeyword = new Throwkeyword();
		objThrowkeyword.div();
	}
	
	

}
