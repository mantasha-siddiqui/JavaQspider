package inheritanceTask;

public class Data {

	int n1= 7;
	int n2 = 9;
}

class AddSubCal extends Data{
	public void Sum1() {
		  System.out.println("Sum is "+(n1+n2));
	  }
	  public void Sub1() {
		  System.out.println("Sub is "+(n1-n2));
    
	  }
}

class MulDivCal extends Data{
	public void Mul() {
		  System.out.println("Multiply is "+(n1*n2));
	  }
	  public void Div() {
		  System.out.println("Division is "+(n1/n2));
    
	  }
}

class Average extends Data{
	public void Avg() {
		System.out.println("Average is " +((n1+n2)/2));
	}
}

class Main6{
	public static void main(String[] args) {
		AddSubCal a = new AddSubCal();
		a.Sum1();
		a.Sub1();
		
		MulDivCal b = new MulDivCal();
		b.Mul();
		b.Div();
		
		Average c = new Average();
		c.Avg();
	}
}