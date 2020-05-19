package OopsConcepts;

public class ClassAndObject {
	
	// Class Variables
			int mod;
			int wheel;
			
	public static void main(String[] args) {

		ClassAndObject c = new ClassAndObject();
			// An object is created with the referenace variable 'c'
			// new ClassAndObject() -- this is the object. 

		ClassAndObject o = new ClassAndObject();
		
		c.mod = 2016;
		c.wheel = 3;
		
		o.mod = 2018;
		o.wheel = 4;
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println(o.mod);
		System.out.println(o.wheel);
		
		//Shifting if Object Reference 
		
		c=o;
	}

}
