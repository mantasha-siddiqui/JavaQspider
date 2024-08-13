package userD;

public class Exception2 {

	public static void main(String[] args) {
		int a = 15;
        try {
        	System.out.println(a<18);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
