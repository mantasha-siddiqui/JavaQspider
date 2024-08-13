package exception;

public class NullPointerException {
	void m1() {
		System.out.println("hy");
	}
	
	public static void main(String [] args) {
		NullPointerException obj = null; 
	         obj.m1();
    
	}

}
