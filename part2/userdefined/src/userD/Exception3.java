package userD;

public class Exception3 {
	public static void main(String[] args) {
		int n  = -1;
        try {
            System.out.println(n > 0);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
}
