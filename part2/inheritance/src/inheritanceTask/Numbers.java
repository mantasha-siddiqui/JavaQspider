package inheritanceTask;

public class Numbers {
	
	int n = 5;
	
	
}

  class Power extends Numbers{
	  public void Sqr() {
		  System.out.println("Square is "+(n*n));
	  }
	  public void cube() {
		  System.out.println("cube is "+(n*n*n));
      
	  }
	 

  class Main4{
	  public static void main(String [] args) {
		  Power d = new Power();
		  d.Sqr();
		  d.cube();
	  }
  }
  }

