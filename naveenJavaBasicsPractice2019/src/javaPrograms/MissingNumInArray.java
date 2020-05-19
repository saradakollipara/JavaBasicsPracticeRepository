package javaPrograms;

public class MissingNumInArray {
	
	public static void main(String[] args) {
		int a[] = {-1,0,1,3,4,5,6}; // missing number in array
		int actualSum = 0;
		for(int i=0;i<a.length;i++) {
			actualSum = actualSum + a[i];
		}
		System.out.println(actualSum);
		
		int expectSum = 0;
		for(int j=-1;j<=6;j++) {
			expectSum = expectSum + j; 
		}System.out.println(expectSum);
		System.out.println("Missing num is: "+(expectSum-actualSum));
	}	
}
