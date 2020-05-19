package OopsConcepts;

public class CallByValueAndCallByRef {
	
	int p,q;

	public static void main(String[] args) {

		int x = 5, y=10;
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int sum = obj.test(x,y);// Call by value or pass by value
		// a copy of vlaue x,y are passed to the method test
		System.out.println(sum);
				
		//Call by reference or pass by reference
		obj.p = 300;
		obj.q = 400;
		obj.sum(obj);
	}
	
	public int test(int a,int b) {
		System.out.println("Pass by value values - " + (a+b));
		a = 15; // this will not effect the value of  x,y
		b = 30;
		int c= a+b;
		return c;
	}
	
	public void sum(CallByValueAndCallByRef o) {
		
		o.p = o.q;
		int sum = o.p + o.q;
		System.out.println(sum);
	}

}
