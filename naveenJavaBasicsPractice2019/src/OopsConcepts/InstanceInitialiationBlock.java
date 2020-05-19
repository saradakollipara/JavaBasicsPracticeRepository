package OopsConcepts;

public class InstanceInitialiationBlock {
	
	{
		System.out.println("Inatance Initialization Block # 1");
	}

	public InstanceInitialiationBlock() {
		System.out.println("Default Constructor");
	}
	{
		System.out.println("Instance Initializer Block # 2");
	}
	public static void main(String[] args) {
		InstanceInitialiationBlock objInitialiationBlock = new InstanceInitialiationBlock();
		InstanceInitialiationBlock objInitialiationBlock2 = new InstanceInitialiationBlock(100);

		
		
	}
	public InstanceInitialiationBlock(int a) {
		System.out.println("Default Constructor" + a);
	}
	{
		System.out.println("Instance Initializer Block # 3");
	}

}
