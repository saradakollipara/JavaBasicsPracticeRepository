package javaPrograms;

public class BiggestNumber {

	public static void main(String[] args) {

		int i=10,j=22,k=100;

//		if (i>j) {
//			
//			if(i>k)
//			{
//				System.out.println(i + " is greater");
//			}
//			else {
//				System.out.println(k + " is greater");
//			}
//		}
//		else if(j>k) {
//			System.out.println(j + " is greater");
//		}
//		else {
//			System.out.println(k + " is greater");
//		}

		if(i>j && i>k) {
			
			System.out.println(i + " is greater");
		}
		else if (j>k) {
			System.out.println(j + " is greater");
		}else {
			System.out.println(k + " is greater");
		}


	}

}
