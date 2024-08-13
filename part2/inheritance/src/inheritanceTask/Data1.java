package inheritanceTask;

public class Data1 {
	int n1 = 5;
	int n2 = 6;
	

}

class SumSub extends Data1{
	public void Sum() {
		System.out.println("Sum is "+ (n1+n2));
	}
	public void Sub() {
		System.out.println("Subtraction is "+ (n1-n2));
	}
}


class MultiDiv extends Data1{
	public void Multi() {
		System.out.println("Multiplication is "+ (n1*n2));
	}
	public void Div() {
		System.out.println("Division is "+ (n1/n2));
	}
}

class Main7{
	public static void main(String [] args) {
		SumSub s = new SumSub();
		s.Sum();
		s.Sub();
		
		MultiDiv m = new MultiDiv();
		m.Multi();
		m.Div();
	}
}


