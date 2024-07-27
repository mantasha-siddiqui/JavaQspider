package extractprog;

public class LowerCase {
	
	public void getUpper(char c) {
        System.out.println(Character.toUpperCase(c));
    }
    
    public void isLowerVowel(char c) {
        c = Character.toLowerCase(c);
        System.out.println (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
    
    
    public static void main(String[] args) {
    LowerCase e = new LowerCase();
    e.getUpper('A');
    e.isLowerVowel('I');
    }

}


