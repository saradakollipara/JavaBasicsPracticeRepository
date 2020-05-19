package JavaBasics;

public class StaticArrays {

	public static void main(String[] args) {

		//1.Integer Array: Is used to store similar data types values in an array varible
		// If size of array does not exist exception "Array Index OutofBound exception" Occurs

		//Dis-advantages of array 
		// 1. Size is fixed - Static Array - Collections are used to overcome this
		// 2. Similar data types values can be stored
		// To over come this problem we use Object array

		int i[] = new int[5];

		for(int j=0; j<i.length; j++) {
			i[j] = j+1;
			System.out.println(i[j]);
		}

		//2.Double Array:
		double d[] = new double[10];
		d[0] = 0.0;
		d[3] = 1.2;

		//3.char array

		char ch[] = new char[3];

		//4.boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//5.String array

		String str[] = new String[4];

		//6.Object array

		Object obj[] = new Object[5];

		obj[0] = "Tom";
		obj[1] = 'M';
		obj[2] = 1244;
		obj[3] = 45.9;
		obj[4] = 70000;

		for(int j=0; j<obj.length; j++) {
			//i[j] = j+1;
			System.out.println(obj[j]);

		}
	}


}
