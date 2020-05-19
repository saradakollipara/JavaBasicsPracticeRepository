package stringPrograms;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {

		String str = "Java is easy";
		char[] charstr = str.toCharArray();
		String strWithoutSpace = "";

		for(int i=0;i<charstr.length;i++) {
			if((charstr[i] != ' ' ) && (charstr[i] !='\t')) {
				strWithoutSpace = strWithoutSpace + charstr[i];
			}
		}
		System.out.println("Given String : "+str);
		System.out.println("String with out Spacce : "+strWithoutSpace);

		String strWithoutSpace2 = str.replaceAll("\\s", "");
		System.out.println(strWithoutSpace2);
	}
}