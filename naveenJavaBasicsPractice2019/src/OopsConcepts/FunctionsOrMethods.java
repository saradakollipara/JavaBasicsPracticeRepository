package OopsConcepts;

public class FunctionsOrMethods {

	public static void main(String[] args) {
		
		FunctionsOrMethods obj = new FunctionsOrMethods();
		 // One object is created with reference variable 'obj'
				// After crating the object the copy of 
				// all non static methods will be given to this object.
		
		obj.test();
		int sum = obj.add();
		System.out.println(sum);
		int div = obj.division(20,10);
		System.out.println(div);

		
	}

	// *****Non static methods*******
	//void - does not return any value
	
	//return type is void
	//no input no output
	public void test() {
		System.out.println("This is test");
		
	}
	
	//return type is int
	//no input, vome output
	public int add()
	{
		int a = 10;
		int b = 20;
		int c = a+ b;
		System.out.println("From add method");
		
		return c;
	}
	
	//return int
	//some input some output
	public int division(int a,int b) {
		
		System.out.println("From Div method");
		int div = a/b;
		
		return div;
		
	}
	
}
