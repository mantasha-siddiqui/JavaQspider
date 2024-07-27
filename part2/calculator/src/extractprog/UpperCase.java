package extractprog;

public class UpperCase {


		
		    public void getLower(char c) {
		        System.out.println(Character.toLowerCase(c));
		    }
		    
		    public void isUpperVowel(char c) {
		        c = Character.toUpperCase(c);
		        System.out.println( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' );
		    }
		    
		    public static void main(String[] args) {
		    	
		    	UpperCase f = new UpperCase();
			    f.getLower('A');
			    f.isUpperVowel('o');
		    	
		    	
		    
		    }
		}


	

