package javaPrograms;

public class SwapStringWithoutTemp {

	public static void main(String[] args) {

		String a = "I love";
		String b = "My kids";
		System.out.println(a);
		System.out.println(b);
		
		a = a+b;
		System.out.println(a.length());
		b = a.substring(0, (a.length()-b.length()));
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
		
	}

}
