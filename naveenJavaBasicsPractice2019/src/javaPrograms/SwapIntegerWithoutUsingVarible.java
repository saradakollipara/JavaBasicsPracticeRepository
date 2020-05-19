package javaPrograms;

public class SwapIntegerWithoutUsingVarible {

	public static void main(String[] args) {

		int a = 20;
		int b =30;
		System.out.println(a +" "+ b);
		
		//with using temp variable
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println(a +" "+ b);
		
		//With using + operator
		a = a +b;
		b = a -b;
		a = a -b;
		System.out.println(a +" "+ b);

		//with using * operator
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println(a +" "+ b);
	}
}
