package OopsConcepts;

public class StaticBlock {
	static int i;
	
	static {
		System.out.println("Static block executed");
		i = 10;
	}
	
	public StaticBlock(){		
		System.out.println("Default constructor is called");		
	}

	public static void main(String[] args) {
		
		System.out.println(i);
		StaticBlock objStaticBlock = new StaticBlock();
	}

}
