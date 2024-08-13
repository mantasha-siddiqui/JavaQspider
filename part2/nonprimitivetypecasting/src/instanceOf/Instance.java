package instanceOf;

public class Instance {
	public void instance() {
		System.out.println("hello");
	}

}

class C extends Instance{
	public void instance() {
		System.out.println("hello");
	}
	
	
}

class main1{
	public static void main(String [] args) {
		Instance i = new C();
		if(i instanceof C) {
			C a = (C) i;
			
		
		}
		
		i.instance();
	}
}