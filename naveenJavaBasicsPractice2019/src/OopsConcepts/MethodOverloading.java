package OopsConcepts;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);	
		obj.sum("addition", 25, 35);
	}

	public static void main (int p) {
		// ***Main method can be overloaded ****
	}

	// Method overloading --> when the method name is same 
	// with different input parameters or arguments 
	//	with different data types with in the same class 
	// with different sequence of data types

	public void sum() { // 0 input parameters
		System.out.println("0 Input parameter");
	}
	public void sum(int i) { // 1 input parameters 
		System.out.println("1 Input parameter");
		System.out.println(i);
	}
	public void sum(int m, int n) { //2 input parameters
		System.out.println("2 Input parameter");
		System.out.println(m+n);
	}
	public void sum(String str,int m,int n) {
		System.out.println("Overloaded method with diffrent order of parameters: ");
		System.out.println(m+n +"  "+ str);
	}
}
