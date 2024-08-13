package classCast;

public class Cc {
	public void cast() {
		System.out.println("hello");
	}
	

}

class M extends Cc{
	public void cast() {
		System.out.println("hyy");
	}
	
}

class main3{
	public static void main(String[] args) {
		Cc a = new Cc();
		
		M c = (M) a;
		
	c.cast();
		
	}
}
