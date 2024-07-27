package addprog;
public class Add {
	public static void add(int a, int b) {
		System.out.println(a + b) ;
    }

    public void  add(int a, int b, int c) {
    	System.out.println(a + b + c) ;
    }
	
	public static void main(String[] args) {
		Add.add(5, 8);
		Add a = new Add();
		a.add(5, 8, 9);
		
	}
	
	
	
   
}
