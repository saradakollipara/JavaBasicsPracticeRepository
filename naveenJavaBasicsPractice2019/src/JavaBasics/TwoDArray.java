package JavaBasics;

public class TwoDArray {

	public static void main(String[] args) {
		// Two dimentional Array
		
	// Elements are stored in the form of MAtrix. like 3*5 or 2*4

		String x[][] = new String[2][3];
		System.out.println("No of Rows: " + x.length); //2 total no.of rows
		System.out.println("No of Columns: "+ x[0].length);
		
		x[0][0] = "a";
		x[0][1] = "b";
		x[0][2] = "c";
		
		x[1][0] = "A";
		x[1][1] = "B";
		x[1][2] = "C";
		
		for (int row=0;row<x.length;row++) {
			for (int col=0;col<x[0].length;col++)
				
			System.out.print(x[row][col]);
		}
			
	}

}
