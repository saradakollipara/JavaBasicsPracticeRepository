package stringPrograms;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {

		String[] str1 = {"Selenium","java","C++","Python"};			
		String[] str2 = {"Tester","QA","Analyst"};
		String[] str3 = {"C++","java","Python","Selenium"};
		
		System.out.println(Arrays.equals(str1, str2));
		System.out.println(Arrays.equals(str1, str3));
		
		Arrays.sort(str1);
		Arrays.sort(str3);
		System.out.println("After sorting ::");
		System.out.println(Arrays.equals(str1, str3));
		System.out.println(Arrays.deepEquals(str1, str3));


	}

}
