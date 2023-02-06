
public class ReverseString {
	
public static void main(String[] args) {
	
	String str = "ABCD";
	String rev = "";
	
//	int len = str.length();
//	
//	for(int i=len-1;i>=0;i--) {
//		rev = rev+str.charAt(i);
//	}
//	System.out.println("Reversed  string is: " +rev);
	
	// Using character array
	
	char a[]= str.toCharArray();
	int len = a.length;
	
	for(int i=len-1;i>=0;i--) {
		rev = rev+a[i];
	}
	System.out.println("Reversed String is: "+rev);
}

}
