
public class Swapping2Numbers {
	
	public static void main(String[] args) {
		
		
		int a =10;
		int b = 20;
		
		// logic 1 = using third value
		//int c = a;
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
		System.out.println("Swap value is " +a+", "+b);
	}

}
