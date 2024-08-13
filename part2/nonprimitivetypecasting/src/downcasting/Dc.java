package downcasting;



public class Dc {
	public void AB() {
		System.out.println("hyy");
	}
	
}
	
 class downcast extends Dc{
	public void AB() {
	System.out.println("hello");
	
}

 }
 
class Mains{
public static void main(String [] args) {
	Dc c=new Dc();
	downcast b = (downcast) c;
	b.AB();
}
}


