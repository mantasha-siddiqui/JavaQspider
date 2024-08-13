package inheritanceTask;

public class Number {
	
	int n1 = 5;
	int n2 = 7;
	
}

  class Calculator extends Number{
	  public void Sum() {
		  System.out.println("Sum is "+(n1+n2));
	  }
	  public void Sub() {
		  System.out.println("Sub is "+(n1-n2));
      
	  }
	  public void Mul() {
		  System.out.println("Mul is "+(n1*n2));
  }

  class Main2{
	  public static void main(String [] args) {
		  Calculator b = new Calculator();
		  b.Sum();
		  b.Sub();
		  b.Mul();
	  }
  }
  }