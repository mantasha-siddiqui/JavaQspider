package task;

public class Ola {
	
	Driver d;
	User u;
	Bike b;
	Auto a;
	Cab c;
	
	public void addUser(User u) {
		this.u = u;
		System.out.println("user is added");
	}
	public void addBike(Bike b) {
		this.b = b;
		System.out.println("Bike is added");
	}
	public void addAuto(Auto a) {
		this.a = a;
		System.out.println("Auto is added");
	}
	public void addCab(Cab c) {
		this.c = c;
		System.out.println("Cab is added");
	}
	public void addDriver(Driver d) {
		this.d = d;
		System.out.println("Driver is added");
	}

}
