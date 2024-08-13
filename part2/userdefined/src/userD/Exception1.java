package userD;

public class Exception1{
	    public static void main(String[] args) {
	    	int a = 8 , b = 0;
	        try {
	            System.out.println(a/b);
	        } catch (DivideByZeroException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
