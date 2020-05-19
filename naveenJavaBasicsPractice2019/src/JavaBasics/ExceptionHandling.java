package JavaBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException  {

		/*checked exception - Checked by the compiler
		 * File not found exception during compile time, 
		 * the programmer has to fix before executing the program.
		 * 
		 * For this use try catch block
		 */
		// checked exception Example
		//1.
		try {
			Thread.sleep(2000); 
			//2.giving invalid path of file
			File file = new File("E://file.txt");
			FileReader fr = new FileReader(file);
		} 
		//		catch(InterruptedException i) {
		//			i.getMessage();
		//			i.printStackTrace();
		//			System.out.println("InterruptedException Occured");
		//		}
		//		catch(FileNotFoundException f) {
		//			f.getMessage();
		//			f.printStackTrace();
		//			System.out.println("FileNotFoundException  Occured");
		//		}
		catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("Checked Exception Cought>>>>>>");

		} 
		System.out.println("......Checked Exception handled.....");


		/*Unchecked Exception - Should be handled by the programmer, 
		 * thrown at runtime of the program. 
		 * these include logic errors, improper use of API,  these are ignored at he time of compilation.
		 * Arithmetic exception
		 * In the try block after an exception is occurred the execution terminates from try block
		 */
		//1.Arithmetic exception
		try {
			int i=10/0;
			System.out.println(i);
			//2.ArrayIndexOutOfBoundsException
			int num[] = {1,2,3,4};
			System.out.println(num[5]);
		} catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
			System.out.println("ArrayIndexOutOBoundsException Occured");
		}
		catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("Unchecked Exception Cought>>>>>>");
		}
		System.out.println(".....Unchecked Exception HAndled.....");

		/*
		 * Errors - Errors are abnormal conditions that happen in severe failures.
		 * Example: JVM out of memory
		 */


	}

}
