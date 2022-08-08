package tutorials;

public class Test1 {

	static int a=10;
	
	public static void m1() {
		System.out.println("Good Afternoon");
	}
	public static void main(String[] args) {
		System.out.println("Main Begins");
		m1();
		m1();
		System.out.println("Main Ends");
	}
	static 
	{
		System.out.println("Hi");
	}
}
