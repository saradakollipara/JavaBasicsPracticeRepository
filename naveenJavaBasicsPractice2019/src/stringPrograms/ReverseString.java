package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "wawa java";

		//using String Buffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

		//using Iterative method
		char[] charStr = str.toCharArray();
		for(int i=charStr.length-1 ; i>=0 ; i-- ) {
			System.out.print(charStr[i]);
		}
		
		String rev = recursiveMethod(str);
		System.out.println('\n'+rev);
	}
	//using recurssive method
	static String recursiveMethod(String str) {
		
		if(str == null || str.length() <= 1) {
			return str;
		}
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}
}
