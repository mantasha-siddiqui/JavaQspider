package inheritanceTask;

public class Customer {
	int p = 2000;
	int r = 50;
	int t = 20;
	
}

  class Calculators extends Customer{
	  public void SI() {
		  System.out.println("SI is "+((p*r*t)/100));
	  }
	  
  class Main3{
	  public static void main(String [] args) {
		  Calculators c = new Calculators();
		  c.SI();
		  
  }
  }

}


