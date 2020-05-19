package JavaBasics;

public class LoopsConcept {
	
	public static void main (String []args) {
		
		/* While loop -- If incrementation is not given then while loop generates infinite loop
		 *  Steps of while loop 
		 *  Initialization
		 *  condition
		 *  increment/decrement		 * 
		 */
		
		System.out.println("From While loop");
		int i = 0;	//Initialization
		while(i <= 10) {		//Condition			
			System.out.println(i);
			i++; 	//Incrementation			
		}
		
		System.out.println("From For loop");
		for(int j=0;j<=10;j++) {
			
			System.out.println(j);
		}
		
		
		
	}

	

}
