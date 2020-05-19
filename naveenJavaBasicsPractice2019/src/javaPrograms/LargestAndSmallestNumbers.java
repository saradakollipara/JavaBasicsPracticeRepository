package javaPrograms;

public class LargestAndSmallestNumbers {

	public static void main(String[] args) {

		int numbers[] = {0,8,-7};
		int largestNum = numbers[0];
		int smallestNum = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(largestNum<numbers[i]) {
				largestNum = numbers[i];
			}
			else if (smallestNum>numbers[i]) {
				smallestNum = numbers[i];
			}
		}
		System.out.println("Largest Number: "+ largestNum);
		System.out.println("Smallest Number: "+ smallestNum);

	}  

}
