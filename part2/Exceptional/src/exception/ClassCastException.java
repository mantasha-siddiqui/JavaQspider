package exception;

public class ClassCastException {
	
	
		public void AB() {
			System.out.println("hyy");
		}
		
		
	}
		
	 class downcast extends ClassCastException {
		public void AB() {
		System.out.println("hello");
		
	}

	 }
	 
	class Mains{
	public static void main(String [] args) {
		ClassCastException c=new ClassCastException();
		downcast b = (downcast) c;
		b.AB();
	}
	}



