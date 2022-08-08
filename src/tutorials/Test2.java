package tutorials;

public class Test2 {
	
	static int a = 10;
	static int b;
	
	static
	{
		System.out.println("Static block executed");
		b=a*4;
	}

	public static void main(String[] args) {
		
		System.out.println("Main Begins");
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		System.out.println("Main ends");
	}

}
