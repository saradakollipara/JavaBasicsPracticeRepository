package javaPrograms;

public class RemoveJunkChar {

	public static void main(String[] args) {

		String s = "@#%$#^& 01234567^$%#@Sharada";
		System.out.println("Given String: " + s);
	
		
		//	Regular Expression [a-zA-Z0-9]
		
		System.out.println("Replaced with regular expression: "+(s.replaceAll("[^a-zA-Z0-9]", "")));
		
	}

}
