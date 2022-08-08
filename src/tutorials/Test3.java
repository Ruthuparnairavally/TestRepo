package tutorials;

public class Test3 {
	
	static int a = 12;
	
	static
	{
		System.out.println("Static block executed");
		int a = 12*12;
	}

	public static void m1() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		System.out.println("Main Begins");
		m1();
		System.out.println("Main Ends");
	}
	static
	{
		System.out.println("Static loc 2 executed");
	}

}
