package inheritanceTask;

public class Measurement {
	
	double l = 5.6;
	double w= 8.2;
	
}

  class Rectangle extends Measurement{
	  public void area() {
		  System.out.println("Rectangle is "+(l*w));
	  }
	  public void Perimeter() {
		  System.out.println("Rectangle is "+(2*(l*w)));

	  }
  }

  class Main1{
	  public static void main(String [] args) {
		  Rectangle a = new Rectangle();
		  a.Perimeter();
		  a.area();
	  }
  }