package inheritanceTask;

public class College {
	String cname = "Galgotias university";
	String name = "Mantasha Siddiqui";
	String branch = "MCA";

}

class Internal extends College{
	int mark1 = 200;
	int mark2 = 400;
	
}

class Semester extends Internal{
	int sum = mark1+mark2;
	


public void displayDetails(){
	System.out.println("my name is "+ name);
	System.out.println("my collegenameis "+ cname);
	System.out.println("branch is "+ branch);
	System.out.println("sum of marks is "+ sum);

	
}
	
	
}

class Main5{

public static void main(String [] args) {
	Semester s = new Semester();
	s.displayDetails();
}
}