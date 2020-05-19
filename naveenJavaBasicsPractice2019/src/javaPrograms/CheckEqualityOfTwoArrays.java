package javaPrograms;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {

		int[] array1 = {2,3,6,8,1};
		int[] array2 = {2,6,3,1,8};
		
		boolean equalOrNot = true;
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		System.out.println(array1[2]);
		System.out.println(array2[2]);
		if(Arrays.equals(array1, array2))
			System.out.println("Given arrays are equal");
				
		if((array1.length) == (array2.length)) {
			for(int i =0;i<array1.length;i++) {
				if(array1[i] != array2[i]) {
					equalOrNot = false;
				}
			}
		} else { 
			equalOrNot =false;
		}
		
		if(equalOrNot == true) {
			System.out.println("Given arrays are equal");
		}
		else {
			System.out.println("Given arrays are not equal");
		}
	}
}
