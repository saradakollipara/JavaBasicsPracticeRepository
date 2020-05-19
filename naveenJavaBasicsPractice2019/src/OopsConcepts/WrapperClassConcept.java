package OopsConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		//To convert string value into integer Wrapper class Integer is used
		//To store values into collections primitive data types should be converted into Wrapper classes 
		Integer i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Boolean, Character all are wrapper classes
		
		//String to Double
		String d = "23.45";
		double d1 = Double.parseDouble(d);
		
		System.out.println(d1+12.99);
		
		//String to Boolean
		String b ="true";
		Boolean b1 = Boolean.parseBoolean(b);
		System.out.println(b1);
		
		
		//***int to String Converstion****
		
		int j = 200;
		System.out.println(j+10);
		String s = String.valueOf(j);
		System.out.println(s+10);
		
		// NumberFormat exception will be thrown for parsing
		// not pure integer to integer
		
		String a = "100A";
		a.replaceAll("A", "1");
		System.out.println(a);
		int a1 = Integer.parseInt(a);
		System.out.println(a1); //throws number format exception
				

	}

}
