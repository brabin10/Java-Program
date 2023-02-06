
public class Main {
	
	public static void main(String[] args) {
		
		
		int a =10;
		int b = 20;
		
//		logic 1 = using third variable
//		int c = a;
//		a = b;
//		b = c;
		
		// logic 2 = use "+" "-" without using third variable
//		a = a+b;
//		b = a-b;
//		a = a-b;
		
		// logic 3 = use "*" "/"
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("Swapping value is " +a+", "+b);
	}

}
