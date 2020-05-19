package stringPrograms;

import java.util.HashMap;
import java.util.Set;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {

		String str2 = new String("w3schools");		
		int count = 0;
		char[] charArray = str2.toCharArray();
		System.out.println("Duplicate Characters are : ");
		for(int i=0;i<str2.length();i++) {
			for(int j=i+1;j<str2.length();j++) {
				if(charArray[i]==charArray[j]) {
					System.out.println(charArray[j]);
					count++;
					break;
					//System.out.println(count);
				}
			}
		} System.out.println("Count of Cahracters are : "+count);
		
	//	StringBuffer strSB = new StringBuffer("StringBufferJava");
		
	//	StringBuilder strSBL = new StringBuilder("StringBuilderJava");
		
		String str = "#w3schools#";
		
		char[] strChar = str.toCharArray();
		//Build Hash map with characters and no.of times they appear in the string
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		for(Character ch : strChar) {
			if(charCountMap.containsKey(ch)) {
				int counter = charCountMap.get(ch);
				charCountMap.put(ch, counter+1);
			}else {
				charCountMap.put(ch,1);
			}            
		}
		Set<Character> charString = charCountMap.keySet();
		System.out.println("Duplicate characters in string : " + str);
		for(Character ch : charString) {
			if(charCountMap.get(ch)>1) {
				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}
		
	}
	
	
	

}
