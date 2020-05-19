package javaPrograms;

public class ReverseAnInteger {

	private static int num; 

	public static void main(String[] args) {
		System.out.println(reverse());
		System.out.println(usingStringBuffer());
	}

	public static int reverse() {
		num = 123456;
		int rev = 0; 
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		return rev;
	}
	
	public static StringBuffer usingStringBuffer() {
		num = 5678;
		StringBuffer rev = new StringBuffer(String.valueOf(num)).reverse();
		return rev;
		//return	new StringBuffer(String.valueOf(num)).reverse();
		 
	}
}
