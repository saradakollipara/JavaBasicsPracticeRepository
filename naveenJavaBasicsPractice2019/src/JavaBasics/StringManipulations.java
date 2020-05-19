package JavaBasics;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str ="This is string Manipulation practice";
		String str2 = "This is string Manipulation practice";
		String str3 = "This is String Manipulation practice";

		
		System.out.println("My string is: " + str);
		System.out.println("length of string: "+str.length());
		
		//indexOf:
		System.out.println("Char at given index: "+str.charAt(5));
		System.out.println("index of given char 's': "+str.indexOf('s'));//first occurrence of s 
		System.out.println("second occurrence of given char 's': "+str.indexOf('s',4 )); //second occurrence of s
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); // also returns the second occurrence of s
		System.out.println("third occurrence of given char 's': "+str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1)); //third occurrence of s
		System.out.println("index of substring 'string': "+str.indexOf("string"));
		System.out.println("index of substring which is not in the given string: " + str.indexOf("test"));
		
		//string comparison:
		System.out.println(str.equals(str2)); // compare two strings
		System.out.println(str.equalsIgnoreCase(str3));
		
		//get substring:
		System.out.println(str.substring(0));
		System.out.println(str.substring(15, 27)); 
		
		//trim:
		String s = " Hello World ";
		System.out.println("trim(): "+ s.trim());
		System.out.println("replace: "+s.replace(" ",""));
		System.out.println(s.replace(" ", "*")); // replace with given character
		
		//split:
		System.out.println("***Split***");
		String test = "12/3/2019";
		String splitValue[] = test.split("/");
		
		for(int i=0;i<splitValue.length;i++) {
			System.out.println(splitValue[i]);
		}
		
		//Concatenate
		System.out.println(s.concat("Selenium"));
		
		
		StringBuffer sb = new StringBuffer("Java");
		StringBuffer sb1 = new StringBuffer("Java Script");
		if(sb.equals(sb1)) {
			System.out.println("same reference objects..");
		}
		else
			System.out.println("Different reference..");

	
		

	}

}
