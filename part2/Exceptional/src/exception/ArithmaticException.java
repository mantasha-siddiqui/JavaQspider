package exception;

public class ArithmaticException {
	
	public static void main(String [] args) {
		int a = 20; 
		int b = 0;
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e) {
//			System.out.println("cant divide");
     		System.out.println(e.getMessage());
//     		e.printStackTrace();			
		}
		
	}}
