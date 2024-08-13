 package upcasting;

public class Uc {
	public void B() {
		System.out.println("hyy");
	}
	
}
	
 class upcast extends Uc{
	public void B() {
	System.out.println("hello");
	
}

 }
 
class Main{
public static void main(String [] args) {
	Uc c=new upcast();
	c.B();
	
	
	
}
}

